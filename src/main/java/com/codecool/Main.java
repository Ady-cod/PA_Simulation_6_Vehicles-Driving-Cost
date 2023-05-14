package com.codecool;

import com.codecool.vehicle.ElectricCar;
import com.codecool.vehicle.Vehicle;
import com.codecool.vehicle.oilcar.DieselCar;
import com.codecool.vehicle.oilcar.GasolineCar;
import com.codecool.vehicle.oilcar.OilCar;
import com.codecool.vehicle.oilcar.SizeType;

public class Main {
    public static void main(String[] args) {

        Vehicle dieselCar = new DieselCar(SizeType.LARGE,8);
        Vehicle gasolineCar = new GasolineCar(SizeType.MID_SIZE,6,200);
        Vehicle electricCar = new ElectricCar(1500,3000);

        System.out.println(dieselCar.calculateCost(4,5000));
        System.out.println(gasolineCar.calculateCost(10,15000));
        System.out.println(electricCar.calculateCost(1,300));
        System.out.println(electricCar.calculateCost(12,0));
        System.out.println(electricCar.calculateCost(1,0));
    }
}