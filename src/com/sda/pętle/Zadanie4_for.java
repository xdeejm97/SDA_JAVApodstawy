package com.sda.pętle;

import java.util.Scanner;

public class Zadanie4_for {
    public static void main(String[] args) {
        //wewnatrz petli for (5-10 razy) pobieraj nazwe produktu
        // i wyswietl go w postaci "Dodano "produkt"
        // * wypisz wszystkie produkty na samym koncu dzialania programu
        //
        //podpowiedz: nad petla tworzycie zmienna typu String
        // wewnatrz petli dodajecie kolejne wpisy (mozecie dodac przecinki)
        // za petla macie zmienna z lista zakupow i mozecie ja wydrukowac
        String lista = " ";
        Scanner scan = new Scanner(System.in);


        for (int i = 1; i<6; i++) {
            System.out.println("Podaj nazwe produktu ");
            String produkt = scan.next();
            System.out.println("Dodano produkt: " + produkt);
            lista += produkt;
            if (i<=6) {
                lista += ",";
            }

        }
        System.out.println("Lista produktów: " + lista );
    }
}



