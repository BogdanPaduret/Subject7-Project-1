package com.company.models;

import java.util.ArrayList;

public class PassengerVehicle extends Vehicle {

    private int seats;
    public ArrayList<String> cnpPassengers = new ArrayList<>();

    public PassengerVehicle (String brand, String series, double tonnage, int seats) {
        super(brand, series, tonnage);
        this.seats = seats;
    }

    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public Object clone() {
        return new PassengerVehicle(this.getBrand(), this.getSeries(), this.getTonnage(),this.getSeats());
    }

    @Override
    public boolean equals(Object o) {
        Vehicle vehicle = (Vehicle) o;
        PassengerVehicle passengerVehicle = (PassengerVehicle) o;
        return this.getBrand().equals(vehicle.getBrand()) &&
                this.getSeries().equals(vehicle.getSeries()) &&
                this.getTonnage() == vehicle.getTonnage();
    }

    @Override
    double getCapacity() {
        return this.getSeats();
    }

}
