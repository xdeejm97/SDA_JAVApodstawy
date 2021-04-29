package com.sda.varargs;

public class przyklad {
    public static void main(String[] args) {
        varArgsPrzyklad(1, 2, 4, 5, 6 ,9, 134, 2345, 236,-1, 43);

    }

    public static void varArgsPrzyklad(int... a){
        for (int element : a) {
            System.out.println(element);
        }
        System.out.println();
        System.out.println(a[0]);
        System.out.println(a[2]);
    }
}
