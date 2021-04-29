package com.sda.pętle;

import java.util.Scanner;

public class Zadanie6_for {
    public static void main(String[] args) {
        //zadanie 3b
        // napisz petle, ktora przyjmuje wartosci typu int
        // dodaje je do siebie a na koniec drukuje ich sume
        // mozecie ustalic umowna górną granice ilosci podanych cyfr
        // * niech jest tak, ze po dodaniu 0, program przerywa dzialanie
        //System.out.println("Podaj liczbę ");
        //Scanner scan = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");
        int suma = 0;
        int liczba = 1;

        while (liczba != 0) {
            liczba = sc.nextInt();
            suma += liczba;
        }
        System.out.println("Suma tych liczb to:" + suma);
    }
}
