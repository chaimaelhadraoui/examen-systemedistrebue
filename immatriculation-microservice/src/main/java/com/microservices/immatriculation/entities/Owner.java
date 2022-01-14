package com.microservices.immatriculation.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Owner {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @NotNull
    private String nom;

    @NotNull
    private String dateNaissance;

    @Column(unique = true)
    private String email;

    @OneToMany(cascade = {CascadeType.ALL})
    Collection<Vehicle> vehicles = new ArrayList<>();
}
