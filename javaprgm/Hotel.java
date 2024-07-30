//1.Write Hotel class with below methods
//a.Method to take item
//a.Method to take item and price
//a.Method to take item, price and quantity
//a.Method to take item,price, quantity and parcel

//1. Write a MedicalShop class with below methods
//a. Method to take medicinename
//b. Method to take medicine name and quantity
//c. Method to take customerName,email,mobileNo,address
//d. Method to take customerName,mobileNo

//NOTE :Message start and end in each method
//Invoke each method least three times , one is implicit, one is explicit and other your choice

class Hotel{
static void order(String item)
{
System.out.println("start order in Hotel");	
System.out.println("item :"+item);	
System.out.println("end order in Hotel");
}	
static void order(String item,int price)
{
System.out.println("start order in Hotel");	
System.out.println("item :"+item );	
System.out.println("price :"+price );	
System.out.println("end order in Hotel");
}	
static void order(String item,int price,int quantity)
{
System.out.println("start order in Hotel");	
System.out.println("item :"+item);	
System.out.println("price :"+price);	
System.out.println("quantity :"+quantity);	
System.out.println("end order in Hotel");
}	
static void order(String item,int price,int quantity,boolean parcel)
{
System.out.println("start order in Hotel");	
System.out.println("item :"+item);	
System.out.println("price :"+price);	
System.out.println("quantity :"+quantity);
System.out.println("parcel :"+parcel);
System.out.println("end order in Hotel");
}	

public static void main(String[] args)
{
System.out.println("start main in Hotel");	
order("gee");
String ash="curd";
order(ash);
order("milk");
order("gee",450);
order("rava",45);
String cost="fish";
int amt=68;
order(cost,amt);
order("gee",450,9);
order("matchbox",2,5,true);
String x="box";
int y=50;
int z=6;
boolean a=true;
order(x,y,z,a);
System.out.println("end main in Hotel");	

}

}
	

