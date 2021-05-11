package com.sda.figury;

public class Kalkulator {
    public static double obliczObwod(Kolo kolo){
        double wynik;
        wynik = 2 * Math.PI * kolo.getR();
        return wynik;
    }
    public static double obliczPole(Kolo kolo){
        return Math.PI * kolo.getR() * kolo.getR();
    }

    public static double obliczObwod(Prostokat prostokat){
        return prostokat.getA() * 2 + prostokat.getB() * 2;
    }
    public static double obliczPole(Prostokat prostokat){
        return prostokat.getA() * prostokat.getB();
    }
    public static double obliczObwod(Trojkat trojkat){
        return trojkat.getA()+ trojkat.getB()+ trojkat.getC();
    }
    public static double obliczPole(Trojkat trojkat){
        double p = (obliczObwod(trojkat))/ 2;
        return Math.sqrt(p * (p - trojkat.getA()) * (p - trojkat.getB()) * (p - trojkat.getC()));
    }

}
