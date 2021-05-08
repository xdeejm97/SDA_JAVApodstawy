package com.sda.metody.pokoj;

public class Pokoj {
   // Stwórz klasę Pokoj.
   // a) Dodaj atrybuty wysokość, szerokość, długość (typu double).
   // b) Dodaj konstruktor, który przyjmie wszystkie wartości.
   //  c) Dodaj drugi konstruktor, który przyjmie szerokość i długość a wysokość
   // ustawi na 2,4.
   // d) Dodaj metody obliczające oraz zwracające pole powierzchni oraz objętość
   // pokoju.
   // e) Dodaj metody wyświetlające pole powierzchni oraz objętość pokoju.
   // f) Z poziomu metody main zaprezentuj działanie poszczególnych metod.
   // g) Stwórz tablicę pokoi. Wyświetl ich parametry
    public Pokoj(double height, double width, double lenght) {
        this.height = height;
        this.width = width;
        this.lenght = lenght;


    }

    private double height;
    private double width;
    private double lenght;

    public Pokoj(double width, double lenght) {
        this.height2 = 2.4;
        this.width2 = width;
        this.lenght2 = lenght;



    }
    private double height2;
    private double width2;
    private double lenght2;

    public double polePokoju() {
        double polePokoju = this.width * this.lenght;
        return polePokoju;

    }public void objetoscPokoj (){
        System.out.println("Pole pokoju wynosi: " + polePokoju());
        System.out.println("Objetosc pokoju wynosi: " + polePokoju() * this.height);

    }
    public void parametr() {
        System.out.println(this.height);
        System.out.println(this.width);
        System.out.println(this.lenght);
    }


}
