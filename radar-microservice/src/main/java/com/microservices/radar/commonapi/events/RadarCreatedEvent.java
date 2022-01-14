package com.microservices.radar.commonapi.events;

import lombok.Getter;

public class RadarCreatedEvent extends BaseEvent<Long>{

    @Getter private double vitessMaximal;
    @Getter private double longitude;
    @Getter private double latitude;


    public RadarCreatedEvent(Long id, double vitessMaximal, double longitude, double latitude) {
        super(id);
        this.vitessMaximal = vitessMaximal;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
