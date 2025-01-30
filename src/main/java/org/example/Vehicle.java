package org.example;

public class Vehicle {
    int numberOfWheels;
    String color;
    Float engineSize;
    String fuelType;

    public Vehicle(int numberOfWheels, String color, Float engineSize, String fuelType){
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType  = fuelType;

    }
    public int getnumberOfWheels(){
        return numberOfWheels;
    }
    public String getcolor(){
        return color;
    }
    public Float getengineSize(){
        return engineSize;
    }
    public String getfuelType(){
        return fuelType;
    }

}
