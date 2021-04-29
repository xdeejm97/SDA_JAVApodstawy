package com.sda.warunki;

import java.util.Scanner;

public class Zadanie7_switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj nazwę tygodnia: ");
        String d = scan.nextLine();

        switch (d) {
            case "Poniedziałek": {
                System.out.println("1");
                break;
            }
            case "Wtorek": {
                System.out.println("2");
                break;
            }
            case "Środa": {
                System.out.println("3");
                break;
            }
            case "Czwartek": {
                System.out.println("4");
                break;
            }
            case "Piątek": {
                System.out.println("5");
                break;
            }
            case "Sobota": {
                System.out.println("6");
                break;
            }
            case "Niedziela": {
                System.out.println("7");
                break;
            }
            default: {
                System.out.println("ERROR");
                break;
            }
        }
    }

}
