package com.microservices.radar.commands.aggregates;

import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import com.microservices.radar.commonapi.commands.CreateRadarCommand;
import com.microservices.radar.commonapi.events.RadarCreatedEvent;

@Aggregate
public class RadarAggregate {
    @AggregateIdentifier
    private Long id;
    private double vitessMaximal;
    private double longitude;
    private double latitude;
    public RadarAggregate() {

    }

    @CommandHandler  // listener on CreateAccountCommand
    public RadarAggregate(CreateRadarCommand command) {
        AggregateLifecycle.apply(new RadarCreatedEvent(
            command.getId(),
            command.getVitessMaximal(),
            command.getLongitude(),
            command.getLongitude()));
    }
     // evoulution function
    @EventSourcingHandler
    public void on(RadarCreatedEvent event) {
       this.id = event.getId();
       this.vitessMaximal = event.getVitessMaximal();
       this.longitude = event.getLongitude();
       this.latitude= event.getLatitude();
    }

}
