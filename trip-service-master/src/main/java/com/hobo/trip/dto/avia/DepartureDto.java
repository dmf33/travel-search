package com.hobo.trip.dto.avia;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepartureDto {

    private String iataCode;
    private String terminal;
    private Date at;
}
