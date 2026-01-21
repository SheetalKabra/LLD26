package org.example.StrategyDesignPattern.WithoutStrategyDesignPattern;

public class PassengerVehicle extends Vehicle {
    @Override
    public void driver() {
        System.out.println("slow...");
    }
}
