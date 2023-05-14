package com.codecool.vehicle;

public class ElectricCar implements Vehicle{
    int batteryCapacity;
    int batteryPower;

    public ElectricCar(int batteryCapacity, int batteryPower) {
        this.batteryCapacity = batteryCapacity;
        this.batteryPower = batteryPower;
    }

    @Override
    public double calculateMaintenanceCost() {
        return 500;
    }

    @Override
    public double calculateInsuranceCost() {
        return batteryCapacity + 1000;
    }

    @Override
    public double calculateConsumptionCost(int distanceTraveled) {
        return batteryPower * 2;
    }
}
