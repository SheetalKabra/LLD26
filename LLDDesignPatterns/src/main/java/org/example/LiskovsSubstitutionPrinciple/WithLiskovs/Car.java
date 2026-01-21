package org.example.LiskovsSubstitutionPrinciple.WithLiskovs;

public class Car extends EngineVehicle{
    @Override
    public int noOfWheels() {
        return 4;
    }
}
