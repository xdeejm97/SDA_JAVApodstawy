package com.sda.Zadania;

import java.util.Scanner;

public class Zad_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number <= 1){
            System.out.println("Przerywam pracę");

        }
        for ( int i = 1; i < number; i++) {
            if (number % i == 0 && number % number == 0){
                System.out.println("Nie");
                break;
            }
            else {
                System.out.println("Tak");
                break;
            }
        }
        }
    }
