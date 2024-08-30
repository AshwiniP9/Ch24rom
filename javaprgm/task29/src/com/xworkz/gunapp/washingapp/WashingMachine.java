package com.xworkz.gunapp.washingapp;
/*Gun --> name,countryMade,type, fire(),display();

Soldier:local var,Police: paramater,Dboss:instance variable,Godse: return-type

WashingMachine ---> brand,type,capacity, rinse(),show();


Megha:local var,Lakshmi: paramater,Abhishek:instance variable,Bhukima: return-type ,Nayana: local var
*/

public class WashingMachine {
    // Fields for the WashingMachine class
    private String brand = "sony ";
    private String type = "large";
    private int capacity = 7; // Capacity in kilograms

    // Default constructor
    public WashingMachine() {
        System.out.println("WashingMachine: No-argument constructor called.");
    }

    public void rinse() {
        System.out.println("Rinsing the clothes.");
    }

    public void show() {
        System.out.println("runs in new file");
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity + " kg");
    }

    // Getters and Setters for encapsulation
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

