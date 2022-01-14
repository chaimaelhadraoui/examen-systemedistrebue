package com.microservices.immatriculation;

import com.microservices.immatriculation.entities.Owner;
import com.microservices.immatriculation.entities.Vehicle;
import com.microservices.immatriculation.repositories.OwnerRepository;
import com.microservices.immatriculation.repositories.VehicleRepository;
import com.microservices.immatriculation.services.IimmatriculationInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ImmatriculationApplication implements CommandLineRunner {

    @Autowired
    private IimmatriculationInitService iimmatriculationInitService;

    @Autowired
    private RepositoryRestConfiguration restConfiguration;


    public static void main(String[] args) {
        SpringApplication.run(ImmatriculationApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        restConfiguration.exposeIdsFor(Owner.class,Vehicle.class);

            iimmatriculationInitService.initOwner();
            iimmatriculationInitService.initVehicle();
    }
}
