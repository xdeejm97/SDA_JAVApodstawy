package com.sda.typy;

import java.util.Scanner;

public class Zadanie_dodatkowe {
    //tresc:
    //napisz prosty program, ktory przelicza centymetry na cale
    //przyjmij ze 1 cal to 2.54 cm
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę w cm: ");
        //dane
        //double cm = 1;
        double cm = scan.nextDouble();
        double inch;
        //obliczenia
        inch =   cm / 2.54;
        //double a = 5.08*inch;
        //double b = 7.62*inch;
        //double c = 10.16*inch;
        //wynik
        System.out.println("Wynik zostanie podanny w calach");
        System.out.format("%.2f%n", inch);
        //System.out.format("%.2f%n" , c);
        //System.out.format("%.2f%n" , b);
        //System.out.format("%.2f%n" , a);
        //System.out.println(" inch");
    }
}