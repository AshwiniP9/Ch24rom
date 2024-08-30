package com.xworkz.gunapp.washingapp;

public class Abhishek {
    private WashingMachine washingMachine;

    public void display() {
        System.out.println("==========================================");
        System.out.println("Abhishek is running");

        if (washingMachine != null) {

            washingMachine.show();
        } else {
            System.out.println("WashingMachine is null");
        }

        System.out.println("Abhishek ends");
    }

}

