package com.sda.warunki;

import java.util.Scanner;

public class Zadanie4_modulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int liczba = scan.nextInt();

        if (liczba % 3 == 0 && liczba % 5 == 0) {
            System.out.println("Liczba jest podzielna przez 3 i 5");
        } else if (liczba % 3 == 0) {
            System.out.println("Liczba jest podzielna przez 3");
        } else if (liczba % 5 == 0) {
            System.out.println("Liczba jest podzielna przez 5");
        } else {
            System.out.println("Liczba nie jest podzielna ani przez 3 ani przez 5");
        }
    }
}
