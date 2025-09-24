package com.airline.fleetmanagement.service;

import com.airline.fleetmanagement.entity.Aircraft;
import com.airline.fleetmanagement.repository.AircraftRepository;

import java.util.List;
import java.util.Optional;

public class AircraftService {

    private final AircraftRepository aircraftRepository;

    public AircraftService(AircraftRepository aircraftRepository){
        this.aircraftRepository=aircraftRepository;
    }
    public Aircraft saveAircraft(Aircraft aircraft){
        return aircraftRepository.save(aircraft);
    }
    public List<Aircraft>getAllAircraft(){
        return aircraftRepository.findAll();
    }
    public Optional<Aircraft>getAircraftById(Long id){
        return aircraftRepository.findById(id);
    }
    public void deleteAircraft(Long id){
        aircraftRepository.deleteById(id);
    }
}
