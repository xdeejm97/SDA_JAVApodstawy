package com.sda.Zadania;

import java.util.Scanner;

public class Liczbypierwsze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 1; i < a; i++) {
            //i += ;
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}

