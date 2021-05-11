package com.sda.figury;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //tresc
        // chcemy miec kalkulator, ktory zczytuje od uzykotniwka nazwy figury
        // oraz jej niezbedne wymiary i oblciza jej pole i obowod
        System.out.println("Podaj nazwę figury: ");
        Scanner input = new Scanner(System.in);
        String figura = input.next();

        if (figura.equals("kolo")){
            System.out.println("podaj promien");
            double r = input.nextDouble();
            Kolo kolo = new Kolo(r);
            System.out.println("wymiary kola: ");
            System.out.println("obwod wynosi: " + Kalkulator.obliczObwod(kolo));
            System.out.println("pole wynosi: " + Kalkulator.obliczPole(kolo));

        } else if(figura.equals("prostokat")){
            System.out.println("podaj boki: ");
            double a = input.nextDouble();
            double b = input.nextDouble();
            Prostokat prostokat = new Prostokat(a, b);
            System.out.println("obwod wynosi: " + Kalkulator.obliczObwod(prostokat));
            System.out.println("pole wynosi: " + Kalkulator.obliczPole(prostokat));

        } else if (figura.equals("trojkat")){
            System.out.println("podaj boki:");
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            Trojkat trojkat = new Trojkat(a, b ,c);
            System.out.println("obwod wynosi: " + Kalkulator.obliczObwod(trojkat));
            System.out.println("pole wynosi: " + Kalkulator.obliczPole(trojkat));
        }
        else {
            System.out.println("Nie ma takiej figury");
        }

    }
}
