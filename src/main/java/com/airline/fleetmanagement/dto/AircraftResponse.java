package com.airline.fleetmanagement.dto;

import com.airline.fleetmanagement.entity.Aircraft;
import lombok.Data;

@Data
public class AircraftResponse {
    private Long id;
    private String registrationNumber;
    private String model;
    private String manufacturer;
    private int capacity;
    private String status;
    private String lastRouteFlown;
    private int yearOfManufacture;
    private int totalFlightHours;

    public static AircraftResponse toResponse(Aircraft aircraft){
        AircraftResponse response=new AircraftResponse();
        response.setId(aircraft.getId());
        response.setRegistrationNumber(aircraft.getRegistrationNumber());
        response.setModel(aircraft.getModel());
        response.setManufacturer(aircraft.getManufacturer());
        response.setCapacity(aircraft.getCapacity());
        response.setStatus(String.valueOf(aircraft.getStatus()));
        response.setLastRouteFlown(aircraft.getLastRouteFlown());
        response.setYearOfManufacture(aircraft.getYearOfManufacture());
        response.setTotalFlightHours(aircraft.getTotalFlightHours());
        return response;
    }
}
