package org.example.LiskovsSubstitutionPrinciple.WithoutLiskovs;

public class Car extends Vehicle{
    @Override
    public int noOfWheels() {
        return 4;
    }
}
