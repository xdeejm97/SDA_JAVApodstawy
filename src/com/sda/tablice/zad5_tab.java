package com.sda.tablice;

import java.util.Arrays;

public class zad5_tab {
    public static void main(String[] args) {
        int[] myArray = {321, 4311, 4, 2, 531, 23};

        for (int element : myArray){
            System.out.println(element);
        }
        Arrays.sort(myArray);

        System.out.println("Najwieksza liczba: " + myArray[myArray.length-1]);
        System.out.println("Druga najwieksza:" + myArray[myArray.length-2]);
        System.out.println("Najmniejsza liczba: " + myArray[0]);
    }
}
