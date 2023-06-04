package com.example.OOPS;

public class Van extends Vehicle implements VehicleInterface{

    @Override
    public void startInterface() {
        System.out.println("Implementing Start Interface");
    }

    @Override
    public void stopInterface() {
        System.out.println("Implementing Stop Interface");
    }


}
