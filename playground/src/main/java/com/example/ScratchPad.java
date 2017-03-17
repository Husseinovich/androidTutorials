package com.example;

public class ScratchPad {

    public static void main(String[] args) {

        Student student = new Student("Hussein", "Mohamed", 33);
        int age = student.getAge();
        String firstName = student.getFirstName();
        String secondName = student.getLastName();

        System.out.print(firstName);

        System.out.print(secondName);

        System.out.print(age);

    }
}
