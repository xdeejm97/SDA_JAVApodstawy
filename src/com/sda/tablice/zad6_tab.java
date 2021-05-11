package com.sda.tablice;

import java.util.Arrays;

public class zad6_tab {
    public static void main(String[] args) {
        int[] myArray1 = {2, 1, 5, 6, 7};
        int[] myArray2 = {1, 2, 5, 3, 7};

       for (int i = 0; i < myArray1.length; i++){
           if (myArray1[i] == myArray2[i]){
               myArray1[i] = 0;
               }
           } System.out.print(Arrays.toString(myArray1));
       }



    }
