package com.codecool.vehicle.oilcar;

public class GasolineCar extends OilCar{
    private int maximumSpeed;

    public GasolineCar(SizeType sizeType, int cylindersNumber, int maximumSpeed) {
        super(sizeType, cylindersNumber);
        this.maximumSpeed = maximumSpeed;
    }

    @Override
    public double calculateMaintenanceCost() {
        return maximumSpeed + cylindersNumber * 10;
    }

    @Override
    public double calculateInsuranceCost() {
        return 1500 + size/2 + cylindersNumber/10;
    }

    @Override
    public double calculateConsumptionCost(int distanceTraveled) {
        return maximumSpeed + cylindersNumber * 10 + size;
    }
}
