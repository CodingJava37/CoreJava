package org.example.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void m1(){

    }

    public static void m2(){
        try{
            FileInputStream fis = new FileInputStream("Users/smritikarn/MyFile.txt");
        }
        catch(FileNotFoundException e){
           // throw new MyExeption("invalid");
        }
    }
    public static void main(String[] args) throws MyExeption {
            m1();
            m2();

        Scanner sc = new Scanner(System.in);
       String s = sc.next();
        System.out.println(s);
        int a = 10, b=0;
        try{
            int res = a/b;
            System.out.println("khjksdh");
        } catch(Exception e){
            System.out.println("AE exception has happened... provide the valid value of b");
        }
    }
}
