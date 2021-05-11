package com.sda.varargs;

public class nowy_przyklad_prezka {
    public static void main(String[] args) {
        printNumbers(3);
    }

     static void printNumbers(int... numbers){
        for (int i = 0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
