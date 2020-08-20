package com.hobo.trip.controller;

import com.hobo.trip.dto.avia.FlightDto;
import com.hobo.trip.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<FlightDto> searchFlights (@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fromDate,
                                          @RequestParam(required = false) @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate toDate,
                                          @RequestParam String fromCity,
                                          @RequestParam String toCity,
                                          @RequestParam int adults) {
        return flightService.searchFlights(fromDate, toDate, fromCity, toCity, adults);
    }
}
