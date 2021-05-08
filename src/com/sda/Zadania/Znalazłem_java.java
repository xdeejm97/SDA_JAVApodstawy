package com.sda.Zadania;

import java.util.Scanner;

public class Znalazłem_java {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
        if (b.contains("Java")){
            System.out.println("Znalazłem Java");
        }
        if (b.startsWith("Java")) {
            System.out.println("Zaczyna się Java");
        }
        if ( b.equals("Java")){
            System.out.println("Równa się Java");
        }
        if (b.endsWith("Java")){
            System.out.println("Kończy się Java");
        }
        System.out.println(b.indexOf("Java"));
    }
}
