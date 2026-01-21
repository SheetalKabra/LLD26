package org.example.LiskovsSubstitutionPrinciple.WithoutLiskovs;

public class Bicycle extends Vehicle{
    @Override
    public boolean hasEngine() {
        return false;
        //return null;
    }
}
