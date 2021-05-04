package com.sda.PetleZadania;

import java.util.Scanner;

public class Zad1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj cyfrę: ");
        int a = sc.nextInt();
        for ( int i = 0; i <= 10; i++){
            if ( a >=11){
                System.out.println("ERROR!");
                break;
            }
            if ( i > a ) {
                break;
            }
            System.out.println(i );
        }
    }
}
