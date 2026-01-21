package org.example.StrategyDesignPattern.WithStrategyDesignPattern.strategies;

public class SuperfastVehicleDriveStrategy extends VehicleDriveStrategy{
    @Override
    public void drive() {
        System.out.println("superfast...");
    }
}
