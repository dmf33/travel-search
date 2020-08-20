package com.hobo.trip.dto.hotel;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContactDto {

    private String phone;
    private String fax;
}
