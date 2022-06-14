package com.java.class36;

interface Bank{
    //by default all variables in interface are public, static and final. it needs a value.
    //final variable names are always in caps by convention.
    int ROUTING_NUMBER = 454324;
    //by default all methods in interface are public and abstract.
    void deposit(int amount);
    void withdraw(int amount);
}

interface PSUBank extends Bank{
    void createOffers();

    void additionalSecurity();
}

interface Building{

}

class ChaseBank implements PSUBank, Building{
    public void deposit(int amount){};
    public void withdraw(int amount){};
    public void createOffers(){};
    public void additionalSecurity(){};
}
public class InterfaceExample {
}
