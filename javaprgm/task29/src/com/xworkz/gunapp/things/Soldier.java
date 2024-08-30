package com.xworkz.gunapp.things;

public class Soldier {
    public Soldier(){
        System.out.println("solidier is const");
    }
    public void order(){
        System.out.println("======================================================");
        System.out.println("start order is runs");
        Gun gun=new Gun();
        gun.display();
        System.out.println("ends oreder is runs");
    }


}
