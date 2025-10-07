package com.airline.fleetmanagement.controller;

import com.airline.fleetmanagement.dto.AircraftRequest;
import com.airline.fleetmanagement.dto.AircraftResponse;
import com.airline.fleetmanagement.entity.Aircraft;
import com.airline.fleetmanagement.mapper.AircraftMapper;
import com.airline.fleetmanagement.service.AircraftService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/api/aircrafts")
@RequiredArgsConstructor
public class AircraftController {

    private final AircraftService aircraftService;

    @PostMapping
    public ResponseEntity<AircraftResponse> addAircraft(@RequestBody AircraftRequest request){
        Aircraft aircraft= AircraftMapper.toEntity(request);
        Aircraft savedAircraft=aircraftService.saveAircraft(aircraft);
        return ok(AircraftMapper.toResponse(savedAircraft));
    }

    @GetMapping
    public ResponseEntity<List<AircraftResponse>> getAllAircraft(){
        List<AircraftResponse>responseList=aircraftService.getAllAircraft()
                .stream().map(AircraftMapper::toResponse).collect(Collectors.toList());
        return ok(responseList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AircraftResponse>getAircraftById(@PathVariable Long id){
        return aircraftService.getAircraftById(id)
                .map(AircraftResponse::toResponse).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>deleteAircraft(@PathVariable Long id){
        aircraftService.deleteAircraft(id);
        return ResponseEntity.noContent().build();
    }
}
