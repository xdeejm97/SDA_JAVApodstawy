package com.sda.pętle;

import java.util.Scanner;

public class Zadanie3_for {
    public static void main(String[] args) {

        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        a = scan.nextInt();

        for (int i = a; i<=a; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
            System.out.println("Fizz");
            } else if (i % 5== 0) {
            System.out.println("Buzz");
            }
            else {
                System.out.println("Iterator");
            }
        }
    }
}
