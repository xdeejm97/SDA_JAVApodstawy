package com.sda.warunki;

import java.util.Scanner;

public class Zadanie6_switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę od 1 do 7");

        int number = scan.nextInt();

        switch (number) {
            case 1: {
                System.out.println("Jest poniedziałek");
                break;
            }
            case 2: {
                System.out.println("Jest wtorek");
                break;
            }
            case 3: {
                System.out.println("Jest środa");
                break;
            }
            case 4: {
                System.out.println("Jest czwartek");
                break;
            }
            case 5: {
                System.out.println("Jest piątek");
                break;
            }
            case 6: {
                System.out.println("Jest sobota");
                break;
            }
            case 7: {
                System.out.println("Jest niedziela");
                break;
            }
            default: {
                System.out.println("Błąd w podawaniu liczby");
                break;
            }
        }
    }
}
