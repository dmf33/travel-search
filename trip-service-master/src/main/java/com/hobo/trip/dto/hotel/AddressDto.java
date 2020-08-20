package com.hobo.trip.dto.hotel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddressDto {

    private String postalCode;
    private String cityName;
    private String countryCode;
    private String stateCode;
}
