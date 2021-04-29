package com.sda.warunki;

import java.util.Scanner;

public class Zadanie2_BMI {
    public static void main(String[] args) {

        double m;
        double kg;
        double BMI;

        System.out.println("Proszę podać wzrost w metrach: ");
        Scanner wzrost = new Scanner(System.in);
        m = wzrost.nextDouble();

        System.out.println("Proszę podać wagę w kg: ");
        Scanner waga = new Scanner(System.in);
        kg = waga.nextDouble();

        System.out.println("Twoje BMI wynosi: ");
        BMI = kg / (m*m);

        System.out.println(BMI);

    }
}
