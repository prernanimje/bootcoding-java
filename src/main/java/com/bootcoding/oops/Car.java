package com.bootcoding.oops;

public class Car {

    public String brand;
    public String color;
    public String model;
    public String fueltype;
    public int seats;
    public int lights;

    public void startEngine(){
        System.out.println("Engine has started");
    }

    public void move(){
        System.out.println("Car is moving");
    }

    public void stopEngine(){
        System.out.println("Engine has stopped");
    }
    public void print(){
        System.out.println("Car Brand : " + brand);
        System.out.println("Car Color : " + color);
        System.out.println("Car Model : " + model);
        System.out.println("Car Fueltype : " + fueltype);
        System.out.println("Car Seats: " + seats);
        System.out.println("Car Lights : " + lights);
    }


}
