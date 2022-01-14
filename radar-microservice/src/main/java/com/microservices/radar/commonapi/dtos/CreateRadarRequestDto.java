package com.microservices.radar.commonapi.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class CreateRadarRequestDto {
    private double vitessMaximal;
    private double longitude;
    private double latitude;
}
