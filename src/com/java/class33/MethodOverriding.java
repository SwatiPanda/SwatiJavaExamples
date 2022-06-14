package com.java.class33;

public class MethodOverriding {

    public static void main(String[] args) {
        ChaseBank cb = new ChaseBank();
        cb.displayInterestRate();
        WellsFargo wf = new WellsFargo();
        wf.displayInterestRate();
    }
}
class Bank{
    int balance;
    public void withdraw(int amount){
        balance = balance - amount;
    }
    public void deposit(int amount){
        balance = balance + amount;
    }
    public void displayInterestRate(){
        System.out.println("6.0%");
    }
}
    class ChaseBank extends Bank{
        @Override
        public void displayInterestRate(){
            super.displayInterestRate();
            System.out.println("7.0%");
        }
    }
    class WellsFargo extends Bank{
        // Annotation
        @Override
        public void displayInterestRate(){
            System.out.println("5.0%");
            super.displayInterestRate();
        }
    }
