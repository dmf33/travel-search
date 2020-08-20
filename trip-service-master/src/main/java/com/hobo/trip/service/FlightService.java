package com.hobo.trip.service;

import com.hobo.trip.dto.avia.FlightDto;
import com.hobo.trip.service.externalService.AmadeusService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
@Slf4j
public class FlightService {

    @Autowired
    private AmadeusService amadeusService;

    public List<FlightDto> searchFlights(LocalDate fromDate, LocalDate toDate, String fromCity, String toCity, int adults) {
        return amadeusService.searchFlights(fromDate, toDate, fromCity, toCity, adults);
    }
}
