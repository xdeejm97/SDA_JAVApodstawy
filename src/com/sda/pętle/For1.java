package com.sda.pętle;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dowolną liczbę: ");
        int a = scan.nextInt();

        for(int i = a; i <8; i++) {
            System.out.println("Aktualna wartość: " +i);
        }
        System.out.println("Koniec pętli");
    }
}
