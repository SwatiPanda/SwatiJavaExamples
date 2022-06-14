package com.java.inheritance;

class Bank{
    Bank(){
        System.out.println("From Bank Class Constructor");
    }
}

class ChaseBank extends Bank{
    ChaseBank(){
        System.out.println("From HSBC Class Constructor");
    }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        ChaseBank hsbc = new ChaseBank();
    }
}