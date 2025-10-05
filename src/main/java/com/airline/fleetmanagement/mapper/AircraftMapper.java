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

    }
}
