package com.sda.wyrazeniaRegularne;

import java.util.Scanner;
import java.util.regex.Pattern;

public class NIP {
    public static void main(String[] args) {
        //walidator dla numeru NIP
        //Prefiks kraju - albo na stale PL, albo jakies dowolne dwie duze litery
        //kod urzedu staly - 123
        //ciag 6 cyfr - dowolne cyfry
        //ostatnia cyfra kontrolna - z zakresu od 4 do 7
        //myslniki pomiedzy kazdym z czlonów
        String regex = "[A-Z]{2}.*-?+123.*-?[0-9]{6}.*-?[4-7]{1}";

        String input1= "PL-123-432197-7";
        String input2= "SA-123-413453-8";

        validate(regex, input1);
        validate(regex, input2);
    }
    public static void validate(String regex, String input){
        Pattern pattern = Pattern.compile(regex);

        if(pattern.matcher(input).matches()){
            System.out.println("pasuje");
        }
        else {
            System.out.println("nie pasuje");
        }
    }
}
