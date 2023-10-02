package org.example.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public final class TryCatchDemo {

    final int x = 10;

    public final void m(){

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args)  {
        try {

            //FileInputStream fis = new FileInputStream("D:/MyFile.txt");
            int a =10, b = 0;
            int res = a/b;
            System.out.println(res);
            System.out.println("after exp");
            System.out.println("after exception");
            //close();

        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("provide proper value");
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println(e.toString());
            //close();

        } finally {
            //close() - resource.
            //exit(1)
            System.out.println("this is inside finally");
        }
    }

    //final vs finally vs finallize
    //final var - fix value,






}
