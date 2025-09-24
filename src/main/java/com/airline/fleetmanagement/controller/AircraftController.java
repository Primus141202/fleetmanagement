package com.airline.fleetmanagement.controller;

import com.airline.fleetmanagement.entity.Aircraft;
import com.airline.fleetmanagement.service.AircraftService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/aircraft")
public class AircraftController {

    private final AircraftService aircraftService;

    public AircraftController(AircraftService aircraftService){
        this.aircraftService=aircraftService;
    }

    @PostMapping
    public ResponseEntity<Aircraft> addAircraft(@RequestBody Aircraft aircraft){
        Aircraft savedAircraft=aircraftService.saveAircraft(aircraft);
        return ResponseEntity.ok(savedAircraft);
    }

    @GetMapping
    public ResponseEntity<List<Aircraft>> getAllAircraft(){
        return ResponseEntity.ok(aircraftService.getAllAircraft());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aircraft>getAircraftById(@PathVariable Long id){
        Optional<Aircraft> aircraft=aircraftService.getAircraftById(id);
        return aircraft.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteAircraft(@PathVariable Long id){
        aircraftService.deleteAircraft(id);
        return ResponseEntity.noContent().build();
    }
}
