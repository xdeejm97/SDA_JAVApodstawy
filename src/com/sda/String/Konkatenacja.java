package com.sda.String;

public class Konkatenacja {
    public static void main(String[] args) {
        String text1 = "My name is ";
        String text2 = "John Travis";

        String finaltext= text1 + text2;
        System.out.println(finaltext);

        String text3 = "This is ";
        String text4 = "Sparta";
        String finaltext2 = text3.concat(text4);
        System.out.println(finaltext2);
    }
}
