package com.sda.klasy;

public class klasa {
    public class Main {
        int a = 1;
        int b = 2;

        public void main(String[] args) {

            metodaJedem();
            metodaDwa(10);
            System.out.println(metodaPomnoz(3));
        }


        public void metodaJedem() {
            System.out.println("Hello, World!");

        }

        public void metodaDwa(int a) {
            System.out.println("Podano " + a);
        }

        public int metodaPomnoz(int a) {
            return a * 2;
        }
    }
}

