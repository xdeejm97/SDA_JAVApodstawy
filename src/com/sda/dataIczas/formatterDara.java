package com.sda.dataIczas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class formatterDara {
    public static void main(String[] args) {
        System.out.println("Podaj date w formacie: yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        String date = sc.next();

        LocalDate parsedDate = LocalDate.parse(date);

        DateTimeFormatter custom = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println(custom.format(parsedDate));
    }
}
