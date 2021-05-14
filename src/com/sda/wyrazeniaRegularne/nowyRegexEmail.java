package com.sda.wyrazeniaRegularne;

import java.util.regex.Pattern;

public class nowyRegexEmail {
    public static void main(String[] args) {    //napisz walidator dla adresu email
        //umówmy się że adres e-mail składa się z:
        //przed małpą: dowolne litery(male, w mailu nie rozrozniamy), dowolne cyfry, znaki: . - _
        //potem małpa
        //po małpie nazwa domeny - znowu dowolna ilosc liter i cyfr   <-- ad. do gwiazdki
        //po nazwie domeny kropka i od 2 do 10 liczba malych liter
        //zaden element nie moze byc pusty (np brak tego co przed malpa)
        //z gwiazdka: zeby nazwa nie mogla sie konczyc kropka. tzn moze byc kropka w nazwie, ale nie na koncu
        //np asdf@ab.cd.com, ale nie asdf@ab..com
        //tzn zeby nie bylo np adres asdf@gmail..com
<<<<<<< HEAD
        String emailRegex = "[a-zA-Z0-9.-_%]+@[a-zA-Z0-9]*\\.[a-z]+";

        String email1 = "damian8156@op.pl";
        String email2= "asd.pl";

        validate(emailRegex, email1);
        validate(emailRegex, email2);
    }
    public static void validate(String emailRegex, String email){
        Pattern pattern = Pattern.compile(emailRegex);

        if (pattern.matcher(email).matches()) {
            System.out.println("Poprawny email");
        } else {
            System.out.println("Bledny email");
        }
=======
        String emailRegex = "[a-z0-9]";

        Pattern emailPattern = Pattern.compile(emailRegex);

        
>>>>>>> ba31a3018662f469f01afa4b40ad014b03e0eb1f



    }
}
