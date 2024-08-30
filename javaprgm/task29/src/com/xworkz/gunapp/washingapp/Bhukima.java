package com.xworkz.gunapp.washingapp;

public class Bhukima {

    // Method to create and return a WashingMachine object
    public WashingMachine god() {
        System.out.println("==========================");
        System.out.println("Bhukima is running");

        WashingMachine washingMachine = new WashingMachine();

        if (washingMachine != null) {
            // Display details of the WashingMachine
            washingMachine.show();
        } else {
            System.out.println("WashingMachine is null");
        }
        
        return washingMachine;
    }


}
