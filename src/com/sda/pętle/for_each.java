package com.sda.pętle;

public class for_each {
    public static void main(String[] args) {
        int[] firstArrat = new int[10];
        for (int i = 0; i <10; i++)
            firstArrat[i]= i + 1;
        for (int x : firstArrat) {
            System.out.println(x);
        }
    }
}
