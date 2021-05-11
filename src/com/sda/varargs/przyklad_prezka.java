package com.sda.varargs;

public class przyklad_prezka {
    public static void main(String[] args) {
        printArgs(1);
        System.out.println();
        printArgs(2, 3);
        System.out.println();
        printArgs(1, 3, 4);
    }
    static void printArgs(int firstArg, int... numbers){
        System.out.println("Argument stały: " + firstArg);
        for (int i = 0; i<numbers.length; i++){
            System.out.println("Argument ze zmiennej grupy: " + numbers[i]);
        }
    }
}
