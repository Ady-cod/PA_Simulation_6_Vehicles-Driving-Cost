package com.codecool.vehicle.oilcar;

public class DieselCar extends OilCar{
    public DieselCar(SizeType sizeType, int cylindersNumber) {
        super(sizeType, cylindersNumber);
    }

    @Override
    public double calculateMaintenanceCost() {
        return 250 + cylindersNumber * 7;
    }

    @Override
    public double calculateInsuranceCost() {
        return 1700 + cylindersNumber * 10;
    }

    @Override
    public double calculateConsumptionCost(int distanceTraveled) {
        return size;
    }
}
