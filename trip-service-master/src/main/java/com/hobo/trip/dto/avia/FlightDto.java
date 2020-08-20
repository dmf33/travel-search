package com.hobo.trip.dto.avia;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class FlightDto {

    private int numberOfBookableSeats;
    private List<ItineraryDto> itineraries = new ArrayList<>();
    private PriceDto price;
}
