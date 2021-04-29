package com.sda.warunki;

import java.util.Scanner;

public class Przykład_ifelse_zrobione1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę: ");
        int number = scan.nextInt();

        if (number < 10) {
            System.out.println("Liczba jest mniejsza niż 10");
        } else if (number == 10) {
            System.out.println("Liczba jest równa 10");
        } else {
            System.out.println("Liczba jest większa niż 10");
        }
    }
}
