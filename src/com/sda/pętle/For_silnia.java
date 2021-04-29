package com.sda.pętle;

import java.util.Scanner;

public class For_silnia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dowolną cyfrę większą od zera: ");
        int a, b = 1;
        a = scan.nextInt();

        for(int i = 1; i <=a; i++) {
            b *= i;
        }
        System.out.println(b);
    }
}
