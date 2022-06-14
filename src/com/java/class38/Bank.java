package com.java.class38;

import java.io.IOException;

public class Bank {
    double amount;
    double balance;
    Bank(double amount, double balance){
        this.amount = amount;
        this.balance = balance;
    }
    public void withdraw() throws IOException {

        if(amount < balance){
            throw new IOException("Insufficient balance");
        }
        else {
            amount -= balance;
        }
    }
    public void deposit(){}
    public void xfrMoney() throws IOException {
        withdraw();
        System.out.println("Money xfrred");
    }
    public void payBills() throws IOException {
        withdraw();
        System.out.println("Pay Bills");
    }
    public static void main(String[] args) throws IOException {

        Bank Bank1 = new Bank(500.0, 1000.0);
        Bank1.xfrMoney();
        Bank1.payBills();

    }
}
