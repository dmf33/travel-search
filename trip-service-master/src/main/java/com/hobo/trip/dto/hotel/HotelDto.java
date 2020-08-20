package com.hobo.trip.dto.hotel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelDto {

    private String type;
    private String name;
    private DescriptionDto description;
    private AddressDto address;
    private ContactDto contact;
    private Integer rating;
}
