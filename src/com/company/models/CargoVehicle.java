package com.company.models;

import java.util.ArrayList;
import java.util.Objects;

public class CargoVehicle extends Vehicle {

    private double kgTransportCapacity;
    public ArrayList<String> cargoSeries = new ArrayList<>();

    public CargoVehicle(String brand, String series, double tonnage, double kgTransportCapacity) {
        super(brand, series, tonnage);
        this.kgTransportCapacity = kgTransportCapacity;
    }

    public double getKgTransportCapacity() {
        return kgTransportCapacity;
    }
    public void setKgTransportCapacity(double kgTransportCapacity) {
        this.kgTransportCapacity = kgTransportCapacity;
    }

    @Override
    public Object clone() {
        return new CargoVehicle(this.getBrand(), this.getSeries(), this.getTonnage(), this.getKgTransportCapacity());
    }

    @Override
    public boolean equals(Object o) {
        Vehicle vehicle = (Vehicle) o;
        CargoVehicle cargoVehicle = (CargoVehicle) o;
        return this.getBrand().equals(vehicle.getBrand()) &&
                this.getSeries().equals(vehicle.getSeries()) &&
                this.getTonnage() == vehicle.getTonnage() &&
                this.getKgTransportCapacity() == cargoVehicle.getKgTransportCapacity();
    }

    @Override
    double getCapacity() {
        return getKgTransportCapacity();
    }

}
