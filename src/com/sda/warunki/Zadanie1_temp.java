package com.sda.warunki;

import java.util.Scanner;

public class Zadanie1_temp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double c;
        double f;

        System.out.println("Podaj liczbe");
        c = scan.nextDouble();
        System.out.println("Wartość w F:");
        f = 32 + 1.8 *c;
        System.out.println(f);
    }
}
