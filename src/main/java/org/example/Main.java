package org.example;


public class Main {
    public static void main(String[] args) {
        //Creating new object for Vehicle and Car
        Vehicle vehicle1 = new Vehicle(4, "Pink", 2.5f, "Gas");
        Car car1 = new Car(4, "White", 1.5f, "Gas", "Mazda");
        //Test cases for methods
        car1.honk();
        car1.displayInfo();



        }
    }
