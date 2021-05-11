package com.sda.Zadania;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class ASCIIjakis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char znak = sc.next().charAt(0);
        char znak2 = sc.next().charAt(0);

        int a = znak;
        int b = znak2;
        System.out.println(Math.abs(a-b));
    }
}
