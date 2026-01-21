package org.example.StrategyDesignPattern.WithStrategyDesignPattern;

import org.example.StrategyDesignPattern.WithStrategyDesignPattern.strategies.SuperfastVehicleDriveStrategy;
import org.example.StrategyDesignPattern.WithStrategyDesignPattern.strategies.VehicleDriveStrategy;

public class SpotyVehicle extends Vehicle{

    public SpotyVehicle() {
        super(new SuperfastVehicleDriveStrategy());
    }
}
