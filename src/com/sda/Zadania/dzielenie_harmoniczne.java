package com.sda.Zadania;

import java.util.Scanner;

public class dzielenie_harmoniczne {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        double b = 0;

        for ( int i = 1; i <= a; i++){

            b = b + (1d/i);

        }
        System.out.println(b);
    }
}
