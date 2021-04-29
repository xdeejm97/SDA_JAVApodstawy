package com.sda.oop;

public class Student {

    public Student(String input_name, int input_age){
        this.name = input_name;
        this.age = input_age;
    }

    private String name;
    private int age;

    public void sayHello(){
        System.out.println("My name is " + name + ", I am " + age + " years old");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
