package org.example.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CustomExceptionTest {


    //FileNotFound  - MyExcption
    //1. we can create both type of exp
    //
    public static void readFile() throws MyExeption {

        try {
            FileInputStream fis = new FileInputStream("D:/MyFile.txt");// compiler -
        } catch (FileNotFoundException e) {
          throw new MyExeption();
        }

    }
    public static void main(String[] args) {

        //readFile();
        String dept = "IT";
        try {
            if (dept != "CSE") {
                System.out.println("not eligible");
                throw new MyExeption("invalid department"); //checked

            }
        }catch (MyExeption e){
            System.out.println(e.getCause());
        }
        System.out.println("not eligible");
    }
}
