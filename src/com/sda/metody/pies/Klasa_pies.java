package com.sda.metody.pies;

public class Klasa_pies {
   /* 1) Stwórz klasę Pies.
            a) Dodaj atrybuty rasa, wiek, płeć
    b) Dodaj metody umożliwiające ustawienie wieku oraz pobranie
    wieku (getAge, setAge)
    c) Dodaj konstruktor, który przyjmie wartości dla rasy i płci, a wiek
    ustawi na 0
    d) Dodaj metodę powodująca wypisanie na ekran dźwięku
    wydawanego przez psa „Woof!"
    e) Z poziomu metody main zaprezentuj działanie poszczególnych
    metod – utwórz obiekt klasy Pies, zmodyfikuj wiek, wyświetl
    parametry psa.
    f) *Stwórz tablicę składającą się z 2 różnych psów, wypisz wartości
    ich atrybutów */
    public Klasa_pies(String rasa, String plec){
        this.wiek = 0;
        this.rasa = rasa;
        this.plec = plec;
    }

    private String rasa;
    private int wiek;
    private String plec;

    public void setWiek(int wiek){
        this.wiek = wiek;
    }
    public int getWiek(){
        return  this.wiek;
    }
    public void szczeka(){
        System.out.println("Hau, Hau!");
    }
    public void parametry(){
        System.out.println(this.rasa);
        System.out.println(this.wiek);
        System.out.println(this.plec);
    }


}
