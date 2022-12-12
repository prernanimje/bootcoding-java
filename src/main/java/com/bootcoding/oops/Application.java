package com.bootcoding.oops;

public class Application {
    public static void main(String[] args) {
        Marker marker= new Marker();

        marker.price=120.55;
        marker.brand="camlin";
        marker.color="red";
        marker.type="Whiteboard";

        marker.refill();
        marker.write("I am learing oops java");
        marker.print();

        Car car= new Car();
        car.brand="Tata";
        car.color="Indigo";
        car.fueltype="Diesel";
        car.lights=5;
        car.seats=8;
        car.model="indigo";

        car.print();
        car.startEngine();
        car.move();
        car.stopEngine();


    }


}
