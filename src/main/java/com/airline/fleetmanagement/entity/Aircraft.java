package com.airline.fleetmanagement.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Aircrafts")
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String registrationNumber;

    private String model;
    private String manufacturer;
    private int capacity;

    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "last_route_flown")
    private String lastRouteFlown;

    private int yearOfManufacture;
    private int totalFlightHours;

    public Aircraft(){}

    public Aircraft(String registrationNumber,String model,String manufacturer,int capacity, Status status, String lastRouteFlown, int yearOfManufacture, int totalFlightHours){
        this.registrationNumber= registrationNumber;
        this.model=model;
        this.manufacturer=manufacturer;
        this.capacity=capacity;
        this.status=status;
        this.lastRouteFlown=lastRouteFlown;
        this.yearOfManufacture=yearOfManufacture;
        this.totalFlightHours=totalFlightHours;
    }

    public Long getId() {
        return id;
    }

    public String getRegistrationNumber(){
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getYearofManufacture(){
        return yearOfManufacture;
    }
    public void setYearofManufacture(int yearOfManufacture){
        this.yearOfManufacture=yearOfManufacture;
    }

    public int getTotalFlightHours(){
        return totalFlightHours;
    }

    public void setTotalFlightHours(int totalFlightHours){
        this.totalFlightHours=totalFlightHours;
    }
}
