package com.airline.fleetmanagement.entity;

import jakarta.persistence.*;

@Entity
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

    public Aircraft(){}

    public Aircraft(String registrationNumber,String model,String manufacturer,int capacity, Status status){
        this.registrationNumber= registrationNumber;
        this.model=model;
        this.manufacturer=manufacturer;
        this.capacity=capacity;
        this.status=status;
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
}
