package org.example.oops;

public class Vehicle {

    public void drive(){
        System.out.println("Driving..");
    }

    public void drive(int speed){
        System.out.println("Driving..");
    }


    public void drive(String str, int speed){
        System.out.println("Driving..");
    }

    public void drive(int speed,String str){
        System.out.println("Driving..");
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.drive(10);
    }
}
