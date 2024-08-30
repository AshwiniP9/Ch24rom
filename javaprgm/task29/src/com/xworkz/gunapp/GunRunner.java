package com.xworkz.gunapp;

import com.xworkz.gunapp.things.*;
import com.xworkz.gunapp.washingapp.*;

public class GunRunner {
    public static void main(String[] args) {
        Gun gun=new Gun();
        gun.display();
        Soldier soldier=new Soldier();
        soldier.order();
        Police police=new Police();
        police.office(gun);
        Dboss dboss=new Dboss();
        dboss.jail();
        Godse godse=new Godse();
        godse.god();
        WashingMachine washingMachine=new WashingMachine();
        washingMachine.show();
        washingMachine.setBrand("hp");
        washingMachine.getBrand();
        washingMachine.setType("small");
        washingMachine.getType();
        washingMachine.setCapacity(8);
        washingMachine.getCapacity();
        washingMachine.show();
        Megha megha = new Megha();
        megha.order();
        Lakshmi lakshmi = new Lakshmi();
        lakshmi.office(washingMachine);
        Abhishek abhishek=new Abhishek();
        abhishek.display();
        Bhukima bhukima = new Bhukima();
        WashingMachine wm = bhukima.god(); //
    }
}
