package com.sda.warunki;

import java.util.Scanner;

public class Zadanie3_trojkat {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj bok a: ");
        int a = scan.nextInt();
        System.out.println("Podaj bok b: ");
        int b = scan.nextInt();
        System.out.println("Podaj bok c: ");
        int c = scan.nextInt();

        if ((a+b>c)&&(a+c>b)&&(b+c>a)) {
            System.out.println("Trójkąt zostanie stworzony");
        } else
            System.out.println("Trójkat nie zostanie stworozny");
        }


}
