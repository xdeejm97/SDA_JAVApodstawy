package com.sda.dataIczas;

import java.time.LocalDate;
import java.util.Scanner;

public class zad1_dataczas {
    public static void main(String[] args) {
        System.out.println("Podaj date w formacie: yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        String date = sc.next();

        LocalDate parsedLocalDate = LocalDate.parse(date);

        System.out.println(parsedLocalDate.plusDays(10));
    }
}
