package com.example.OOPS;

public class Car extends Vehicle{

    private String make;
    private String model;


    public Car(){
        this.make="XXX";
        this.model="ZZZ";
    }

    public Car(String make, String model){
        this.make=make;
        this.model=model;
    }

    public void display(){
        Car c=new Car();
        System.out.println("Car make:"+make);
        System.out.println("Car model:"+model);
    }

    public void navigation(){
        System.out.println("Navigation for car");
    }

    @Override
    public void start(){
        super.inBetween();
        System.out.println("Starting a car Vehicle");
    }

    @Override
    public void stop(){
        System.out.println("Stopping a car vehicle");
    }

}
