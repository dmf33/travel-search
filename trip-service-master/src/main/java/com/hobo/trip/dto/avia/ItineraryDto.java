package com.hobo.trip.dto.avia;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ItineraryDto {

    private String duration;
    private List<SegmentDto> segments = new ArrayList<>();

}
