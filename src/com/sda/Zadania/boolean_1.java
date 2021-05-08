package com.sda.Zadania;

import java.util.Scanner;

public class boolean_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
//
        //boolean result = (a > 0 && b < 0) || (a < 0 && b > 0);
        //System.out.println(result);
        int c = sc.nextInt();

        int siedemKG = c / 7;
        int jedenKG = c % 7;
        System.out.println((siedemKG + jedenKG) <= 6);
    }
}
