package com.hobo.trip.mapper;

import com.amadeus.resources.FlightOfferSearch;
import com.hobo.trip.dto.avia.ArrivalDto;
import com.hobo.trip.dto.avia.DepartureDto;
import com.hobo.trip.dto.avia.FlightDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FlightMapper {

    FlightDto toFlightDtoFromAmadeus(FlightOfferSearch flightOfferSearch);

    List<FlightDto> toFlightDtosFromAmadeus(List<FlightOfferSearch> flightOfferSearches);


    @Mapping(target = "at", dateFormat = "yyyy-MM-dd'T'HH:mm:ss")
    ArrivalDto toArrival(FlightOfferSearch.AirportInfo info);

    @Mapping(target = "at", dateFormat = "yyyy-MM-dd'T'HH:mm:ss")
    DepartureDto toDeparture(FlightOfferSearch.AirportInfo info);
}
