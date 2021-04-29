package com.sda.tablice;

public class Zad3 {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int[] tab2 = new int[myArray.length];
        for (int element : myArray) {
            System.out.print(element + "");
        }
        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            tab2[i] = myArray[myArray.length - 1 - i];
        }
        for (int element : tab2) {
            System.out.print(element + " ");
        }

    }
}
