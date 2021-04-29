package com.sda.oop;
import com.sda.oop.Student;
public class Main {
    public static void main(String[] args) {
        Student student = new Student("Jakub", 27);
        Student student_dwa = new Student("Bob", 28);
        student.getAge();
        student.setAge(27);
        //student.sayHello();
        //student_dwa.sayHello();

        //student.setName("Bob");
       // student.sayHello();

        System.out.println(student.getName());
        //System.out.println("age = " + student.age);
        //System.out.println("name = " + student.name);
    }
}
