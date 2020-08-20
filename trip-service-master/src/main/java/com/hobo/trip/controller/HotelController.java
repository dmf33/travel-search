package com.hobo.trip.controller;

import com.hobo.trip.dto.hotel.HotelOfferDto;
import com.hobo.trip.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/hotel")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping
    public List<HotelOfferDto> searchHotels(@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate fromDate,
                                            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate toDate,
                                            @RequestParam String city,
                                            @RequestParam int adults) {
        return hotelService.searchHotels(fromDate, toDate, city, adults);
    }
}
