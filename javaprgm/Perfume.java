/*Perfume : Declare four variables brand,cost,price,quantity
Declare no param const
Declare constructor to init brand,price
Declare constructor to init brand,price,quantity
Declare constructor to init brand,price,quantity,const*/
class Perfume{
String brand;
int price;
int quantity;
public Perfume(){
	System.out.println("creating a no parameter constructor");
}	
Perfume(String brand){
	System.out.println("creating a  parameter constructor have brand");
	this.brand=brand;
	
}
Perfume(int price){
	System.out.println("creating a  parameter constructor have price");
	this.price=price;
	
}
Perfume(String brand,int price){
	System.out.println("creating a  parameter constructor have brand and price.....");
	this.brand=brand;
	this.price=price;
}
Perfume(String brand,int price,int quantity){
	System.out.println("creating a  parameter constructor have brand and price.....");
	this.brand=brand;
	this.price=price;
	this.quantity=quantity;
}


	public static void main(String[] args){
	Perfume perfume1 = new Perfume();
        Perfume perfume2 = new Perfume("bell vita");
        System.out.println("Perfume brand is = " + perfume2.brand);

        Perfume perfume3 = new Perfume(1000);
        System.out.println("Perfume price is = " + perfume3.price);

        Perfume perfume4 = new Perfume("bell vita", 1000);
        System.out.println("Perfume brand is = " + perfume4.brand);
        System.out.println("Perfume price is = " + perfume4.price);
        
        Perfume perfume5 = new Perfume("bell vita", 1000, 10);
        System.out.println("Perfume brand is = " + perfume5.brand);
        System.out.println("Perfume price is = " + perfume5.price);
        System.out.println("Perfume quantity is = " + perfume5.quantity);
	
}
	
	
}
