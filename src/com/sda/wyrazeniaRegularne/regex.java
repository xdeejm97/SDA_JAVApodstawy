package com.sda.wyrazeniaRegularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        //napisz validator dla numeru PESEL
        String peselRegex = "[0-9]{11}";
        Pattern peselPattern = Pattern.compile(peselRegex);


        String input = "93120406098";

        Matcher matcher = peselPattern.matcher(input);
        if (matcher.matches()){
            System.out.println("Pesel jest poprawny");

        }else {
            System.out.println("Pesel nie jest poprawny");
        }


    }
}
