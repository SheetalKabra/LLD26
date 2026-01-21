package org.example.LiskovsSubstitutionPrinciple.WithoutLiskovs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new MotorCycle());
        vehicles.add(new Car());
        //this is breaking the LSP, as bicycle doesn't has the engine. Its narrowing down the method feature...
        vehicles.add(new Bicycle());

        for(Vehicle vehicle: vehicles){
            System.out.println(vehicle.hasEngine());
        }
    }
}
