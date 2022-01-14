package com.microservices.immatriculation.repositories;

import com.microservices.immatriculation.entities.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin
public interface OwnerRepository extends JpaRepository<Owner, Long> {
}
