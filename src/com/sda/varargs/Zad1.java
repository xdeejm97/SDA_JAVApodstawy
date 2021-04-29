package com.sda.varargs;

public class Zad1 {
    public static void main(String[] args) {
        varArgs(1, 2, 5, 7, 98, 23, 345);

    }
    public  static void varArgs(int b,int... a) {
        for (int i = b; i < a.length-1; i++){
            a[i]= a[i+1];
            }
        }

    }
