package com.hobo.trip.dto.hotel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelOfferDto {

    private String type;
    private HotelDto hotel;
    private boolean available;
    private List<OfferDto> offers = new ArrayList<>();
}
