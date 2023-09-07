package org.example.oops;

public class Calculator {

    public static void sum(int a, int b){
        System.out.println(a+b);
    }

    public static void mul(int a, int b){
        System.out.println(a*b);
    }
//.java -> .class -> jvm : output
public static void main(String[] args) {

        sum(100,2);
        mul(100,3);
}
}
