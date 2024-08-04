/*Create a copy using each const, and print the variables after creating

Metal: Declare two instance variables name,cost
Declare no param const
Declare constructor to init name
Declare constructor to init cost
Declare constructor to init name and cost
Perfume : Declare four variables brand,cost,price,quantity
Declare no param const
Declare constructor to init brand,price
Declare constructor to init brand,price,quantity
Declare constructor to init brand,price,quantity,const
CoffeePowder : declare four variables cost,company,weight,manfDate
Declare no param const
Declare constructor to init company
Declare constructor to init company,cost,weight,manfDate
Declare constructor to init company,manfDate
Declare constructor to init weight*/

class Metal{
String name;
int cost;
public Metal(){
	System.out.println("creating a no parameter constructor");
}	
Metal(String name){
	System.out.println("creating a  parameter constructor have name");
	this.name=name;
	
}
Metal(int cost){
	System.out.println("creating a  parameter constructor have cost");
	this.cost=cost;
	
}
Metal(String name,int cost){
	System.out.println("creating a  parameter constructor have name and cost.....");
	this.name=name;
	this.cost=cost;
}


	public static void main(String[] args){
	Metal metal1=new Metal();
	Metal metal2=new Metal("iron");
	System.out.println("metal name is="+metal2.name);
	Metal metal3=new Metal(600);
	System.out.println("metal cost is="+metal3.cost);
	Metal metal4=new Metal("iron",600);
	System.out.println("metal cost is="+metal4.name);	
	System.out.println("metal cost is="+metal4.cost);	
	}
	
	
	
	
}

