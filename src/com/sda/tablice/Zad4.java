package com.sda.tablice;

public class Zad4 {
    public static void main(String[] args) {
        int[][] tab;
        tab = new int[5][5];
        for (int i = 0; i<tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + " ");
            }
            System.out.println();
        }
    }
}
