package ru.kuzinatra.aircraftcalculator.entity;

public abstract class FlyingVehicle implements Vehicle {
    private int capacity;
    private double maxSpeed;
    private double fuelConsumption;

    public FlyingVehicle(int capacity, double maxSpeed, double fuelConsumption) {
        this.capacity = capacity;
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public double calculateFuelConsumption(double distance) {
        return (double) Math.round((calculateTravelTime(distance) * fuelConsumption) * 100) / 100;
    }

    @Override
    public double calculateTravelTime(double distance) {
        return (double) Math.round((distance / maxSpeed) * 100) / 100;
    }
}
