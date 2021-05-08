package com.sda.metody.static_kalkulator;

import java.util.Scanner;

public class Main_kalkulator {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Napisz znak matematyczny: ");
        Kalkulator.znak = sc.next();

        //double wynik= Kalkulator.oblicz();
        //System.out.println(wynik);



    }
}
