package org.example.oops;

public class Truck extends Vehicle {

    public void drive(boolean b){
        System.out.println("Driving truck..");
    }

    @Override
    public void drive(){
        System.out.println("Driving truck..");
    }

}
