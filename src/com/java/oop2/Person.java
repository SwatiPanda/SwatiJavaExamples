package com.java.oop2;

public class Person {

    String name;
    int age;
    int price;
    String phoneNumber;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("printing Name-Age of "+ name +" "+ age);
    }
    public Person(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        System.out.println("printing Name-Phone number of " + name + " "+ phoneNumber);
    }
    public Person(){
        System.out.println("Details of Person:");

    }
    public void printAll(){
        System.out.println("Name: "+ name+ ", Age: "+ age+ ", Phone number: "+ phoneNumber);
    }

}
