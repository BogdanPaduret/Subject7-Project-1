package com.company.models;

public abstract class Vehicle {

    private final String brand;
    private String series;
    private double tonnage;

    public Vehicle(String brand, String series, double tonnage) {
        this.brand = brand;
        this.series = series;
        this.tonnage = tonnage;
    }

    public String getBrand() {
        return brand;
    }
    public String getSeries() {
        return series;
    }
    public double getTonnage() {
        return tonnage;
    }

    abstract double getCapacity();

}
