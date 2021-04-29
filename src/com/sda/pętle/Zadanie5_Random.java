package com.sda.pętle;

import java.util.Random;
import java.util.Scanner;

public class Zadanie5_Random {
    public static void main(String[] args) {

        Random r = new Random();
        int i = -1;
        while (i % 5 != 0) {
            i = r.nextInt(100);
            System.out.println("wartosc = " + i);
        }

    }
}
