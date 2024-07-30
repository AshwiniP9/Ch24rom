//Declare a class , and write 5 method to write some information

class Icecreamshop{
	static String shopname(String name){
	System.out.println("strating shopname in Icecreamshop");
	return name;	
	}
	static String famousIceCream(String famous){
	System.out.println("strating famousIceCream in Icecreamshop");
	return famous;
	}
	static int famousIceCost(int cost)
	{
	System.out.println("strating famousIceCost in Icecreamshop");
	return cost;
	}
	static int ratings_IceCream(int rate){
	System.out.println("strating ratings_IceCream in Icecreamshop");
	return rate;
	}
	static String area(String area){
	System.out.println("strating area in Icecreamshop");
    return area;
	}
	public static void main(String[] args){
	System.out.println("strating main in Icecreamshop");
	String name=Icecreamshop.shopname("naturals");
	System.out.println("shopname :"+name);
	}	
}