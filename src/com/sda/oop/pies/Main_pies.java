package com.sda.oop.pies;

import com.sda.oop.pies.Klasa_pies;

public class Main_pies {
    public static void main(String[] args) {
        Klasa_pies pies1 = new Klasa_pies("Owczarek", "M");
        Klasa_pies pies2 = new Klasa_pies("Labrador", "F");

       // pies1.szczeka();
        pies1.setWiek(5);
       // pies1.szczeka();
        //pies1.parametry();

        Klasa_pies[] tablica_psow= {pies1, pies2};
        for (Klasa_pies pies: tablica_psow){
            pies.parametry();
            System.out.println();
        }

    }
}
