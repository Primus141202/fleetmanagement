package com.airline.fleetmanagement.entity;

import jakarta.persistence.*;

@Entity
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String registrationNumber;

    private String model;
    private String manufacturer;
    private int capacity;

}
