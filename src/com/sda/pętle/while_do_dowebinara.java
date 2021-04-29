package com.sda.pętle;

import java.util.Scanner;

public class while_do_dowebinara {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
    int b = 1;
    do {
        a = sc.nextInt();
        b+=a;
        System.out.println(b);
    } while (a!=0);
    }
}