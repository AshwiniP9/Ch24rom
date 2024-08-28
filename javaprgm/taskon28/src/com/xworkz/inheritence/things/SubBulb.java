package com.xworkz.inheritence.things;


public class SubBulb  extends Bulb{
    public SubBulb() {
        System.out.println("SubBulb constructor created");
    }

    public static void main(String[] args) {
        SubBulb subBulb1=new SubBulb();
        subBulb1.brand="Philiphs";
        System.out.println("Brand ="+subBulb1.brand);
        subBulb1.buy();

    }

}
