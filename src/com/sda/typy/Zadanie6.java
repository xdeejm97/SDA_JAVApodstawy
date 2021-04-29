package com.sda.typy;

import java.util.Scanner;

public class Zadanie6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj imię ");
        String name = scan.nextLine();
        System.out.println("Podaj wiek ");
        int age = scan.nextInt();

        System.out.println("Witaj, " + name + " masz " + age + " lat");
    }
}
