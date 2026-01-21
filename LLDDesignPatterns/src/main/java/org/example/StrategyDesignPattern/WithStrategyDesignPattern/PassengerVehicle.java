package org.example.StrategyDesignPattern.WithStrategyDesignPattern;

import org.example.StrategyDesignPattern.WithStrategyDesignPattern.strategies.SlowVehicleDriveStrategy;
import org.example.StrategyDesignPattern.WithStrategyDesignPattern.strategies.SuperfastVehicleDriveStrategy;
import org.example.StrategyDesignPattern.WithStrategyDesignPattern.strategies.VehicleDriveStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new SlowVehicleDriveStrategy());
    }
}
