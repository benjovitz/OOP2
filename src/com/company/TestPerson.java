package com.company;

public class TestPerson {
    public static void main(String[] args) {
        Person person1 = new Person("Daniel",22);
        System.out.println(person1.toString());
        person1.hasBirthday();
        System.out.println(person1.toString());

    }
}
