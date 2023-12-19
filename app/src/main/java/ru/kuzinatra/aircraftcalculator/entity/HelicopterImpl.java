package ru.kuzinatra.aircraftcalculator.entity;

public class HelicopterImpl extends FlyingVehicle {
    public HelicopterImpl(int capacity, double maxSpeed, double fuelConsumption) {
        super(capacity, maxSpeed, fuelConsumption);
    }

    @Override
    public double calculateFuelConsumption(double distance) {
        double result = distance * super.getFuelConsumption() / 100_000;
        return (double) Math.round(result * 100) / 100;
    }

    @Override
    public double calculateTravelTime(double distance) {
        double result = distance / super.getMaxSpeed();
        return (double) Math.round(result * 100) / 100;
    }
}
