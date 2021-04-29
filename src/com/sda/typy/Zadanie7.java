package com.sda.typy;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwszą wartość ");
        int a = scan.nextInt();
        System.out.println("Podaj drugą wartość ");
        int b = scan.nextInt();

        System.out.println("Wynik to: " + (a + b));
    }
}
