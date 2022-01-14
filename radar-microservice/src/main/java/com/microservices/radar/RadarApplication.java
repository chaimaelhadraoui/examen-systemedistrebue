package com.microservices.radar;

import com.microservices.radar.entities.Radar;
import com.microservices.radar.repositories.RadarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class RadarApplication {

    public static void main(String[] args) {
        SpringApplication.run(RadarApplication.class, args);
    }
    @Bean
    CommandLineRunner start(RadarRepository radarRepository, RepositoryRestConfiguration restConfigration){
        return args->{
            restConfigration.exposeIdsFor(Radar.class);
            radarRepository.save(new Radar(null , 100,1.002,1.008));
            radarRepository.save(new Radar(null , 100, 0.0099,1.0999));

            radarRepository.findAll().forEach(r->{
                System.out.println(r.getVitessMaximal()+" Position:"+r.getLatitude()+","+r.getLongitude());
            });
        };
    }
}
