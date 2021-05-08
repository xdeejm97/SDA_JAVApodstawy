package com.sda.metody.pokoj;

public class Main_pokoj {
    public static void main(String[] args) {
        Pokoj pokoj1 = new Pokoj(2.4, 5, 10);
        Pokoj pokoj2 = new Pokoj(4, 5, 6);

        pokoj1.polePokoju();
        pokoj1.objetoscPokoj();


        Pokoj[] tablica_pokoj = {pokoj1, pokoj2};
        for (Pokoj pokoj : tablica_pokoj) {
            pokoj.parametr();
            System.out.println();
        }

    }
}
