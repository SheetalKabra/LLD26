package org.example.StrategyDesignPattern.WithStrategyDesignPattern;

import org.example.StrategyDesignPattern.WithStrategyDesignPattern.strategies.VehicleDriveStrategy;

public class Vehicle {
    private VehicleDriveStrategy vehicleDriveStrategy;

    public Vehicle(VehicleDriveStrategy vehicleDriveStrategy) {
        this.vehicleDriveStrategy = vehicleDriveStrategy;
    }

    public void drive(){
        vehicleDriveStrategy.drive();
    }
}
