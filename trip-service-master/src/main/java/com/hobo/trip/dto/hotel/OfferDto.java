package com.hobo.trip.dto.hotel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hobo.trip.dto.avia.PriceDto;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class OfferDto {

    private String type;
    private String id;
    private Integer roomQuantity;
    private String rateCode;
    private String category;
    private DescriptionDto description;
    private PriceDto price;//todo: add other fields if needed
}
