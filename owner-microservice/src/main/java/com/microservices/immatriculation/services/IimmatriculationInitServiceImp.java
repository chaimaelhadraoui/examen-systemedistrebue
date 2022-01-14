package com.microservices.immatriculation.services;

import com.microservices.immatriculation.entities.Owner;
import com.microservices.immatriculation.entities.Vehicle;
import com.microservices.immatriculation.repositories.OwnerRepository;
import com.microservices.immatriculation.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class IimmatriculationInitServiceImp implements IimmatriculationInitService{
    @Autowired
    private OwnerRepository ownerRepository;

    @Autowired
    private VehicleRepository vehicleRepository;

    @Override
    public void initOwner() {
        ownerRepository.save(new Owner(null,"chaimae","01/02/1998","email",null));
    }

    @Override
    public void initVehicle() {
        vehicleRepository.save(new Vehicle(null,"mercidis1","mercidis","fiscale","llatest",null));
    }
}
