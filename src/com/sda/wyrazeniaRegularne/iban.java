package com.sda.wyrazeniaRegularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class iban {
    public static void main(String[] args) {
<<<<<<< HEAD
        String regex = "[A-Z]{2}[0-9]{28}";

        String input = "PL2509876567876567654238765428";
        String input2 = "Pl21312312312321312321312322222";
        String input3 = "97042805076";

        validate(regex, input);
        validate(regex, input3);
        validate(regex, input2);
    }

    public static void validate(String regex, String input){
        Pattern pattern = Pattern.compile(regex);

        if (pattern.matcher(input).matches()) {
            System.out.println("poprawny");
        }
        else {
            System.out.println("nie jest poprawny");
=======
        String ibanRegex = "[A-Z]{2}[0-9]{28}";

        Pattern ibanPattern = Pattern.compile(ibanRegex);

        String input = "PL2509876567876567654238765428";
        String input2= "Pl21312312312321312321312322222";

        Matcher matcher = ibanPattern.matcher(input);
        Matcher matcher1 = ibanPattern.matcher(input2);
        if (matcher.matches()) {
            System.out.println("IBAN jest poprawny");
        } else if (matcher1.matches()){
            System.out.println("IBAN nie jest poprawny");
        }
        else {
            System.out.println("IBAN nie jest poprawny");
>>>>>>> ba31a3018662f469f01afa4b40ad014b03e0eb1f
        }
    }
}
