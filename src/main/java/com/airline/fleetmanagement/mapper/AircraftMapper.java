package com.airline.fleetmanagement.mapper;

import com.airline.fleetmanagement.dto.AircraftRequest;
import com.airline.fleetmanagement.dto.AircraftResponse;
import com.airline.fleetmanagement.entity.Aircraft;
import com.airline.fleetmanagement.entity.Status;

public class AircraftMapper {

    public static Aircraft toEntity(AircraftRequest dto){
        Aircraft aircraft=new Aircraft();
        aircraft.setRegistrationNumber(dto.getRegistrationNumber());
        aircraft.setModel(dto.getModel());
        aircraft.setCapacity(dto.getCapacity());
        aircraft.setStatus(Status.valueOf(dto.getStatus()));
        aircraft.setManufacturer(dto.getManufacturer());
        aircraft.setLastRouteFlown(dto.getLastRouteFlown());
        aircraft.setTotalFlightHours(dto.getTotalFLightHours());
        aircraft.setYearOfManufacture(dto.getYearOfManufacture());
        return aircraft;

    }

    public static AircraftResponse toResponse(Aircraft aircraft){
        AircraftResponse dto=new AircraftResponse();
        dto.setId(aircraft.getId());
        dto.setRegistrationNumber(aircraft.getRegistrationNumber());
        dto.setModel(aircraft.getModel());
        dto.setCapacity(aircraft.getCapacity());
        dto.setStatus(aircraft.getStatus().name());
        dto.setManufacturer(aircraft.getManufacturer());
        dto.setLastRouteFlown(aircraft.getLastRouteFlown());
        dto.setTotalFlightHours(dto.getTotalFlightHours());
        dto.setYearOfManufacture(dto.getYearOfManufacture());
        return dto;

    }
}
