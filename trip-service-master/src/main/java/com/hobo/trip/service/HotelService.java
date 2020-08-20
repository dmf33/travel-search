package com.hobo.trip.service;

import com.hobo.trip.dto.hotel.HotelOfferDto;
import com.hobo.trip.service.externalService.AmadeusService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
public class HotelService {

    @Autowired
    private AmadeusService amadeusService;

    public List<HotelOfferDto> searchHotels(LocalDate fromDate, LocalDate toDate, String city, int adults) {
        return amadeusService.searchHotels(fromDate, toDate, city, adults);
    }
}
