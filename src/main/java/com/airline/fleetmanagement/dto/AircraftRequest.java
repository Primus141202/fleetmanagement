package com.airline.fleetmanagement.dto;

import lombok.Data;

@Data
public class AircraftRequest {

    private String registrationNumber;
    private String model;
    private String manufacturer;
    private int capacity;
    private String status;
    private String lastRouteFlown;
    private int yearOfManufacture;
    private int totalFLightHours;
}
