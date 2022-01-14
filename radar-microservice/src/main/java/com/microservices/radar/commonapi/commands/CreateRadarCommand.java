package com.microservices.radar.commonapi.commands;


import lombok.Getter;

public class CreateRadarCommand extends BaseCommand<Long>{

    @Getter private double vitessMaximal;
    @Getter private double longitude;
    @Getter private double latitude;
    public CreateRadarCommand(Long id, double vitessMaximal, double longitude, double latitude) {
        super(id);
        this.vitessMaximal = vitessMaximal;
        this.longitude = longitude;
        this.latitude = latitude;

    }
}
