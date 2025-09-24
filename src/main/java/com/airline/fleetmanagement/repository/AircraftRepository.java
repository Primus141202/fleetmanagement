package com.airline.fleetmanagement.repository;

import com.airline.fleetmanagement.entity.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AircraftRepository extends JpaRepository<Aircraft,Long> {
    Aircraft findByRegistrationNumber(String registrationNumber);
}
