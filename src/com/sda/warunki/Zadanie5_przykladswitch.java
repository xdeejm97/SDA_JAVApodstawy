package com.sda.warunki;

import java.util.Scanner;

public class Zadanie5_przykladswitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę: ");
        int number;
        number = scan.nextInt();

        switch (number) {
            case 10: {
                System.out.println("Liczba to 10");
                break;
            }
            case 100: {
                System.out.println("Liczba to 100");
                break;
            }
            default: {
                System.out.println("Liczba jest różna od 10 i 100");
                break;
            }
        }
    }
}
