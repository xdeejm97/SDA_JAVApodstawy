package com.sda.oop.static_kalkulator;

public class Kalkulator {
    // 1. Stwórz kalkulator korzystając z metod statycznych:
    // a. Stwórz najbardziej popularne metody: dodawanie, odejmowanie,
    // mnożenie, dzielenie, reszta z dzielenia wewnątrz klasy „Kalkulator"
    // b. Stwórz mechanizm wyboru przez użytkownika, która metoda zostanie
    // wykonana. Do zapisania definicji komend wprowadzanych przez
    // użytkownika użyj pól statycznych
    // c. Zaprezentuj działanie poszczególnych metod
    public static String znak;
    private static double a;
    private static double b;

    private static double dodawanie(double a, double b) {
        return a + b;
    }

    private static double odejmowanie(double a, double b) {
        return a - b;
    }

    private static double mnozenie(double a, double b) {
        return a * b;
    }

    private static double dzielnie(double a, double b) {
        return a / b;
    }

    private static double modulo(double a, double b) {
        return (a % b);
    }

   // private static double oblicz() {
   //     double wynik;
   //     switch (znak) {
   //         case "+": {
   //             dodawanie(a, b);
   //             break;
   //         }
   //         case "-": {
   //             odejmowanie(a, b);
   //             break;
   //         }
   //         case "*": {
   //             mnozenie(a, b);
   //             break;
   //         }
   //         case "/": {
   //             dzielnie(a, b);
   //             break;
   //         }
   //         case "%": {
   //             modulo(a, b);
   //             break;
   //         }
   //         default: {
   //             System.out.println("ERROR");
   //             break;
   //         }
//
//
   //     }
   //     return wynik;
   // }
}