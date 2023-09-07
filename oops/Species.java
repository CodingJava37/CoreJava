package org.example.oops;

public interface Species {

    public final int x = 10;
    public String name = "Something";
    public void eat();
    public void walk();

   // public Species() {};

     //java 8 - static and default methods

    public static void sleep(){
        //x =19;
        System.out.println("Will sleep 8 hours..");
    }

    public default void talk(){
        System.out.println("Will sleep 8 hours..");
    }
}
