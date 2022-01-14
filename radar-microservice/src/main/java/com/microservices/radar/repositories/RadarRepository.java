package com.microservices.radar.repositories;

import com.microservices.radar.entities.Radar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin
public interface RadarRepository extends JpaRepository<Radar, Long> {
}
