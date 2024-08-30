package com.xworkz.gunapp.things;
/*Gun --> name,countryMade,type, fire(),display();

Soldier:local var,Police: paramater,Dboss:instance variable,Godse: return-type

WashingMachine ---> brand,type,capacity, rinse(),show();


Megha:local var,Lakshmi: paramater,Abhishek:instance variable,Bhukima: return-type ,Nayana: local var
*/



public class Gun {
    public String name="Rifle";
    public String countryMade="indea";
    public String type="large";
  public   Gun(){
        System.out.println("Gun is no agr const....");
    }
    public void fire( ){

    }
    public void display(){

        System.out.println("gun name :"+name);
        System.out.println("location of manufacturing :"+countryMade);
        System.out.println("type of gun :"+type);
    }


}
