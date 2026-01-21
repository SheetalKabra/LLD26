package org.example.StrategyDesignPattern.WithStrategyDesignPattern;

import org.example.StrategyDesignPattern.WithStrategyDesignPattern.strategies.SuperfastVehicleDriveStrategy;
import org.example.StrategyDesignPattern.WithStrategyDesignPattern.strategies.VehicleDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle() {
        super(new SuperfastVehicleDriveStrategy());
    }
}
