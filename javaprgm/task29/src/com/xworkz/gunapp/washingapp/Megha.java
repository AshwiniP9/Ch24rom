package com.xworkz.gunapp.washingapp;


public class Megha {

        // Method to simulate ordering process with local variables
        public void order() {
            System.out.println("======================================================");
            System.out.println("Order process starts");

            // Local variable for WashingMachine
            WashingMachine washingMachine = new WashingMachine();
            washingMachine.setBrand("Bosch");
            washingMachine.setType("Front Load");
            washingMachine.setCapacity(9);

            // Display details of the WashingMachine
            washingMachine.show();

            System.out.println("Order process ends");
        }


    }


