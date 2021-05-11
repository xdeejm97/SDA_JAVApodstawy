package com.sda.wyrazeniaRegularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class iban {
    public static void main(String[] args) {
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
        }
    }
}
