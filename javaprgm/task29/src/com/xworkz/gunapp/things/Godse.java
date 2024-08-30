package com.xworkz.gunapp.things;

public class Godse {

    public Gun god() {
        System.out.println("==========================");
        System.out.println("god is runs");
        Gun gun = new Gun();
        if (gun != null) {
            gun.display();

        } else
            System.out.println("gun is null");

        return gun;


    }
}
