package com.sda.pętle;

import java.util.Locale;

public class petla1_slack {
    public static void main(String[] args) {
        char name = '*';
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (i >= j) {
                    System.out.print(name);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
