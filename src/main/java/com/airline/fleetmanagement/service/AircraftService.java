package com.airline.fleetmanagement.service;

import com.airline.fleetmanagement.entity.Aircraft;
import com.airline.fleetmanagement.repository.AircraftRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AircraftService {

    private final AircraftRepository aircraftRepository;


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
