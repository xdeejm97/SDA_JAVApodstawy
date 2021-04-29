package com.sda.warunki;

import java.util.Scanner;

public class Zadanie8_kalkulator {
    public static void main(String[] args) {
        // napisz kalkulator ktory
        // pobiera 2 liczby od uzytkownika
        // pobiera znak dzialania ( + - * / )
        //drukuje wynik
        // * dodaj mozliwosc potegowania i wyciagania pierwiastka
        //         //Math.pow(a, b) == podnosi a do potegi b
        //        //Math.sqrt(a) == wyciaga pierwiastek kwadratowy z a
        //          //Math.pow(a, 1/b) == pierwiastek b-stopnia z a
        // proponowane znaki: power dla potegi, root dla pierwiastka
        Scanner scan = new Scanner(System.in);
        double one = scan.nextInt();
        String sign = scan.next();
        double two = scan.nextInt();

        switch (sign) {
            case "+": {
                System.out.println(one + two);
                break;
            }
            case "-": {
                System.out.println(one - two);
                break;
            }
            case "*": {
                System.out.println(one * two);
                break;
            }
            case "/": {
                System.out.println(one / two);
                break;
            }
            case "^": {
                System.out.println(Math.pow(one, two));
                break;
            }
            case "?": {
                System.out.println(Math.pow(one, 1/two));
                break;
            }
            default: {
                System.out.println("ERROR");
                break;
            }


        }

    }
}
