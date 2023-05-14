package com.codecool.vehicle;

public interface Vehicle {
    double calculateMaintenanceCost();
    double calculateInsuranceCost();
    double calculateConsumptionCost(int distanceTraveled);

     default double calculateCost(int monthsNumber,int distanceTraveled) {
        double maintenanceCost = calculateMaintenanceCost();
        double insuranceCost = calculateInsuranceCost();
        double consumptionCost = calculateConsumptionCost(distanceTraveled);
        return monthsNumber * (maintenanceCost + (insuranceCost/12)) + (consumptionCost * distanceTraveled)/100;
    }

}
