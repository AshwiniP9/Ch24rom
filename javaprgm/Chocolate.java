/*Init properties using 4 different ways
Declare a method to print all instance variables
Create least 3 copies

Chocolate: brand,price,flavour,size*/
class Chocolate{
	public static void main(String[] args){
	Chocolate chocolate=new Chocolate("large");
	chocolate.buy("milk");
	chocolate.order();
	Chocolate chocolate1=new Chocolate("small");
	chocolate1.brand="Dairy";
	chocolate1.buy("chocolate");
	chocolate1.setCost(1000);
	chocolate1.order();
	Chocolate chocolate2=new Chocolate("medium");
	chocolate2.setCost(6000);
	chocolate2.order();
}
String brand="parle";
String size;
String flavour;
double cost; 	
public	Chocolate(String size){
        this.size = size;
}	
 void buy(String flavour){
		this.flavour=flavour;
			
}
public void setCost(double cost){
	this.cost=cost;
	
}
public void order(){
	System.out.println("speaker brand:"+brand);
	System.out.println("speaker size:"+size);
	System.out.println("speaker flavour:"+flavour);
	System.out.println("speaker cost:"+cost);
	 System.out.println("=======================================");
}

	
	
}