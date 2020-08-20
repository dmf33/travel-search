package com.hobo.trip.dto.avia;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class SegmentDto {

    private DepartureDto departure;
    private ArrivalDto arrival;
    private String carrierCode;
    private String duration;
}
