package com.sda.typy;

import java.util.Scanner;

public class klasa_scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wiek ");
        int age = scan.nextInt();
        System.out.println("Podaj wypłatę");
        double payment = scan.nextDouble();
        scan.nextLine();
        System.out.println("Podaj imię: ");
        String name = scan.nextLine();

        System.out.println("Cześć " + name);
        System.out.println("Twój wiek to " + age);
        System.out.println("Twoja wypłata to " + payment);
    }
}
