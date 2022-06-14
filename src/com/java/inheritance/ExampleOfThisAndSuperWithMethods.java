package com.java.inheritance;

class ParentClass {
    public void printData(){
        System.out.println("1.Parent Class Method");
    }
}

class ChildClass extends ParentClass{
    public void printData(){
        System.out.println("2.Child Class Method");
        //printData(); - method calls itself, so it's infinite loop
        // super.printData();   - This will call super class method so no recursion
    }
}

public class ExampleOfThisAndSuperWithMethods {
    public static void main(String[] args) {
        ChildClass cc = new ChildClass();
        cc.printData();
    }
}