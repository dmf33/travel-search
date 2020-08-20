package com.hobo.trip.dto.avia;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ArrivalDto {

    private String iataCode;
    private String terminal;
    private Date at;
}
