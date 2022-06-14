package com.java.oop4;

  public class Car {
       static int count;
    Car(int count) {
       this.count = count;
    }
    public void printCount(){
        System.out.println(count);
    }


}
class CarTester {
    public static void main(String[] args) {
        Car c1 = new Car(1);
        Car c2 = new Car(2);

        Car c3 = new Car(3);
        Car c4 = new Car(4);
        Car c5 = new Car(5);
        c2.printCount();
        c5.printCount();
    }
}
