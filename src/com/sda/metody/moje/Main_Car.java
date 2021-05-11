package com.sda.metody.moje;

public class Main_Car {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();

        car1.setColor("white");
        car1.setBrand("Mercedes");
        car1.setMaxSpeed(250);
        car1.printCarParameters();

        car2.setBrand("Fiat");
        car2.setColor("black");
        car2.setMaxSpeed(220);
        car2.printCarParameters();
    }
}
