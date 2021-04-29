package com.sda.String;

public class Zadanie_string {
    public static void main(String[] args) {
       // System.out.println(doubleLetters("abcd"));
        System.out.println(doubleWords("Pomidor Jabłko Chleb" ));
    }

    public static String doubleLetters(String input){
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c  = input.charAt(i);
            result = result + c +c;
        }
        return result;
    }
    public static String doubleWords( String input) {
        String result1 = "";
        for (String word : input.split(" ")){
            result1 = result1 + word + " " + word + " ";
        }

        return result1;


    }
}
