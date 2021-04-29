package com.sda.warunki;

import java.util.Scanner;

public class ZadanieMojeswitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Napisz cyfrę miesiąca: ");
        int month = sc.nextInt();

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 8:
            case 10:
            case 12:
                System.out.println("Miesiąc ma 31 dni");
                break;

            case 2: {
                System.out.println("Miesiąc ma 28 dni");
                break;
            }
            default: {
                System.out.println("Miesiąc ma 30 dni");
                break;
            }


        }
    }
}
