package org.example;


public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle(4, "Pink", 2.5f, "Gas");
        Car car1 = new Car(4, "White", 1.5f, "Gas", "Mazda");
        //Test Cases for Methods
        car1.honk();
        car1.displayInfo();



        }
    }
