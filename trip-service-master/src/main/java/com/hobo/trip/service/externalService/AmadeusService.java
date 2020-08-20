package com.hobo.trip.service.externalService;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.hobo.trip.dto.avia.FlightDto;
import com.hobo.trip.dto.hotel.HotelOfferDto;
import com.hobo.trip.exception.InternalServerErrorException;
import com.hobo.trip.mapper.FlightMapper;
import com.hobo.trip.mapper.HotelMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
@Slf4j
public class AmadeusService {

    @Autowired
    private Amadeus amadeus;

    @Autowired
    private FlightMapper flightMapper;
    @Autowired
    private HotelMapper hotelMapper;

    private static final int MAX_SEARCH_RESULTS = 10;

    public List<FlightDto> searchFlights(LocalDate fromDate, LocalDate toDate, String fromCity, String toCity, int adults) {
        try {
            var searchParams = Params.with("originLocationCode", fromCity)
                    .and("destinationLocationCode", toCity)
                    .and("departureDate", fromDate)
                    .and("adults", adults)
                    .and("max",MAX_SEARCH_RESULTS);
            if (toDate != null) {
                searchParams.and("returnDate", toDate);
            }
            var searchResult = Arrays.asList(amadeus.shopping.flightOffersSearch.get(searchParams));
            return flightMapper.toFlightDtosFromAmadeus(searchResult);
        } catch (ResponseException e) {
            throw new InternalServerErrorException("Unable to get flights", e);
        }
    }

    public List<HotelOfferDto> searchHotels(LocalDate fromDate, LocalDate toDate, String city, int adults) {
        try {
            var searchParams = Params.with("cityCode", city)
                    .and("checkInDate", fromDate)
                    .and("checkOutDate", toDate)
                    .and("adults", adults);
            var searchResult = Arrays.asList(amadeus.shopping.hotelOffers.get(searchParams));
            return hotelMapper.toHotelOffersFromAmadeus(searchResult);
        } catch (ResponseException e) {
            throw new InternalServerErrorException("Unable to get flights", e);
        }
    }
}
