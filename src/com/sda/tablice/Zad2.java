package com.sda.tablice;

public class Zad2 {
    public static void main(String[] args) {
        String[] myArray = {"Andrzej", "Marek", "Paweł", "Damian", "Franek"};
        String suma = "";
        for (String element : myArray) {
            suma = suma + element + ", ";
            if (element.length() > 5) {
            }

        }System.out.println(suma);




    }
}
