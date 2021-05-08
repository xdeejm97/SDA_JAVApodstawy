package com.sda.Zadania;

public class tablica {
    public static void main(String[] args) {
        int[] numbers = {6, 5, 4, 5, 10, 5, 8, 3, 10, 6, 6, 6, 4, 3, 2, 8, 1, 3, 4, 7};

        for (int number : numbers) {
            for (int i = 1; i < numbers.length; i++) {
                System.out.println(number);
            }
        }
    }
}


