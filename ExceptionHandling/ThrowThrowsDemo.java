package org.example.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class ThrowThrowsDemo {

    //try -catch - finally - throw & throws


    public void  readFile()  throws ArithmeticException {
            int res = 10/0;
    }


    public void divide(){
       
            int a = 10, b = 0;
            int res = a / b;  //


        //System.out.println(res);
    }

    public static void main(String[] args) {
            ThrowThrowsDemo th = new ThrowThrowsDemo();

                th.divide();

            System.out.println("khjksdh");
    }
}
