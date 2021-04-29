package com.sda.varargs;

public class Zad2 {
    public static void main(String[] args) {
        roznicaMinMax(2, 4, 56, 7, 4, 23, 1);
    }
    public static void roznicaMinMax(int...a){
        int min = a[0];
        int max = a[0];

        for (int i = 0; i < a.length; i++){
            if ( a[i]< min)
                min = a[i];
            if ( a[i] > max ) {
                max = a[i];
            }
        }
        System.out.println(max-min);
    }
}
