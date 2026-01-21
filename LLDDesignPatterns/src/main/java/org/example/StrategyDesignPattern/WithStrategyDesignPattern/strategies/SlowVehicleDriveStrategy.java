package org.example.StrategyDesignPattern.WithStrategyDesignPattern.strategies;

public class SlowVehicleDriveStrategy extends VehicleDriveStrategy{
    @Override
    public void drive() {
        System.out.println("slow...");
    }
}
