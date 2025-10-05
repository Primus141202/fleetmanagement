package com.airline.fleetmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "aircraft")
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String registrationNumber;

    private String model;
    private String manufacturer;
    private int capacity;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "last_route_flown")
    private String lastRouteFlown;

    private int yearOfManufacture;
    private int totalFlightHours;



}
