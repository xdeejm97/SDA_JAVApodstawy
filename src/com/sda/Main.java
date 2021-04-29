package com.sda;

import java.util.Scanner;

public class Main {
    int a = 1;
    int b = 2;

    public static void main(String[] args) {


        metodaJedem();
        metodaDwa(10);
        System.out.println(metodaPomnoz(3));
        System.out.println(metodaTrzecia(2));
        System.out.println(abc(3 *4));
    }


    public static void metodaJedem (){
        System.out.println("Hello, World!");

    }

    public static void metodaDwa(int a){
        System.out.println("Podano " + a);
    }
    public static int metodaPomnoz(int a){
        return a*2;
    }
    public static int metodaTrzecia(int a) {
        return a*10;
    }
    public static int abc(int a) {
        return a *10;
    }


}
