package com.example.OOPS;

public class Cycle extends Vehicle{

    private String make;
    private String model;


    public Cycle(){
        this.make="XXX";
        this.model="ZZZ";
    }

    public Cycle(String make, String model){
        this.make=make;
        this.model=model;
    }

    public void navigation(){
        System.out.println("Navigation for Cycle");
    }

    public void display(){
        Cycle c=new Cycle();
        System.out.println("Car make:"+make);
        System.out.println("Car model:"+model);
    }


    @Override
    public void start(){
        System.out.println("Starting a vehicle");
    }

    @Override
    public void stop(){
        System.out.println("Stopping a vehicle");
    }
}
