package org.example.StrategyDesignPattern.WithStrategyDesignPattern;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new SpotyVehicle();
        vehicle.drive();

        Vehicle vehicle1 = new PassengerVehicle();
        vehicle1.drive();

    }
}
