package com.company;

public class Person {
    private String name;
    private int age;

    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void hasBirthday(){
    this.age++;
    }

    public String toString(){
return name + " " + age;
    }
}
