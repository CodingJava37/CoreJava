package org.example.exceptionhandling;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class MyClass {



    //right a code to divide a no - inputs will be given by user - a/b

    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        int[] values = new int[2];
        System.out.println("Input A..");
        int a = sc.nextInt();
        System.out.println("Input B..");
        int b = sc.nextInt();
        values[0] = a;
        values[1] =b;
        return values;
    }

    public static void divide(int a, int b){
        float res = 0;
        if(b >0 ){
            res = a/b;
        }
        else{
            System.out.println("Invalid input..");
        }

        System.out.println(res);
        System.out.println("pgm completed");
    }

    //abstraction(what} - oops concept, hide the details, via - abstract class or Interface(how)


    public static void main(String[] args)  {
        int[] inputs = input();
        System.out.println(inputs[0] + inputs[1]);
        MyClass.divide(inputs[0], inputs[1]);

        ThrowThrowsDemo th = new ThrowThrowsDemo();
        try{
            th.readFile();
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }



        th.divide();
    }

    // throw vs throws?
    // exception obj created by?  - method
    // if exp not handled- jvm ? - object pass to DEH--> print the e object
    // error - runtime
    // excpetion type - cjecked and unchecked
    // throws to avoid checked exp and delegate the code to handle  exp to caller funtion.
    //can we create custom exp - yes
    //how?  - by extending Exception class

}


