package com.xworkz.gunapp.things;

public class Dboss {
    Gun gun;
    public void jail(){
        System.out.println(("=========================================="));
        System.out.println("dboss is runs");
        if (gun !=null){
        Gun gun1=new Gun();
            gun1.display();
        }
        else
            System.out.println("gun is null");
        System.out.println("dboss is ends");
    }
}
