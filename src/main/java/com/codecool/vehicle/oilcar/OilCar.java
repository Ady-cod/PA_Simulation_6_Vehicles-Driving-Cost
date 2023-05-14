package com.codecool.vehicle.oilcar;

import com.codecool.vehicle.Vehicle;

public abstract class OilCar implements Vehicle {
    SizeType sizeType;
    protected int size;
    protected int cylindersNumber;

    public OilCar(SizeType sizeType, int cylindersNumber) {
        this.sizeType = sizeType;
        this.cylindersNumber = cylindersNumber;
        this.size = sizeType.generateRandomSize();
    }
}
