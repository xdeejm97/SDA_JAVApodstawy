package com.sda.Zadania_workbook;

public class Zad1_tabliczkaMnozenia {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i <= j || i >=j) {
                    System.out.print(String.format("%4s", i *j));
                }
            }
            System.out.println();
        }
    }
}
