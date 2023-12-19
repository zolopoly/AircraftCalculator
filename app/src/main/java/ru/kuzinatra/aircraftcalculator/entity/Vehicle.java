package ru.kuzinatra.aircraftcalculator.entity;

public interface Vehicle {

    /**
     * расчёт расхода топлива на заданное расстояние
     *
     * @param distance - заданное расстояние
     * @return - расхода топлива
     */
    double calculateFuelConsumption(double distance);

    /**
     * расчёта времени следования на заданное расстояние
     *
     * @param distance - заданное расстояние
     * @return - времения следования
     */
    double calculateTravelTime(double distance);
}
