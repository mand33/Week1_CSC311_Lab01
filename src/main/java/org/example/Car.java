package org.example;

public class Car extends Vehicle {
    private String brand;
    public Car(int numberOfWheels, String color, Float engineSize, String fuelType, String brand){
        super(numberOfWheels, color, engineSize, fuelType);
        this.brand = brand;
    }
    //Method to print honk message
    public void honk(){
        System.out.println("Honk, honk!");
    }
    //Method that displays information from inherited class and current
    public void displayInfo(){
        System.out.println("Number of Wheels: " + getnumberOfWheels());
        System.out.println("Color: " + getcolor());
        System.out.println("Engine Size: " + getengineSize());
        System.out.println("Fuel Type: "+ getfuelType());
        System.out.println("Brand: "+ this.brand);
    }
}
