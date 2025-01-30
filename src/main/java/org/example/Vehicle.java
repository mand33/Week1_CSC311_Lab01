package org.example;

public class Vehicle {
    //Int Variables
    private int numberOfWheels;
    private String color;
    private float engineSize;
    private String fuelType;

    public Vehicle(int numberOfWheels, String color, Float engineSize, String fuelType){
        //Setters
        this.numberOfWheels = numberOfWheels;
        this.color = color;
        this.engineSize = engineSize;
        this.fuelType  = fuelType;

    }
    //Getters
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
