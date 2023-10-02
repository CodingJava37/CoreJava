package org.example.exceptionhandling;

public class MyExeption extends Exception {//checked,

    MyExeption( ){
        System.out.println("Invalid file..");
    }
    MyExeption(String msg){
        super(msg); // DEH - exception object

    }


    //why custom msg not getting printed.
    //custom exp need? -

    //system1 - system2
    //file --> (file.contains("smriti")--> exception ) - exception object - jvm - handle - DEH -
    // FileNotFound, input file for processing sytem 2 has not arrived

    // MyExp - throw new MyEx()




}
