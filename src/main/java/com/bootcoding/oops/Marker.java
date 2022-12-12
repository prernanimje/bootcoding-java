package com.bootcoding.oops;

public class Marker {
    public String type;
    public String color;
    public String brand;
    public Double price;

    public void refill (){
        System.out.println("refill marker successfully");

    }
    public void write(String message){
        System.out.println("On white board = " + message);
}
  public void print(){
      System.out.println("Marker Type =  " +type);
      System.out.println("Marker Brand = " +brand);
      System.out.println("Marker Price = " +price);
      System.out.println("Marker Color = " +color);
  }
}
