/*Laptop--->connect(int speed)--->Router.network(speed)-->Provider-->provide(speed)

Main--> Laptop.connect(40);*/
class Provider{
	public static void provide(int speed){
	System.out.println("start provide in provider");	
	System.out.println("provider:"+speed);	
	System.out.println("end provide in provider");		
	}
}
class Router{
	public static void network(int veryspeed){
	System.out.println("start network in Router");	
	Provider.provide(veryspeed);
	System.out.println("end network in Router");	
	}
}
class Laptop{
	public static void connect(int vspeed){
	System.out.println("start network in Router");	
	Router.network(vspeed);
	System.out.println("end network in Router");	
	}
	 public static void main(String[] args)
	{
	System.out.println("start main in Laptop");
    Laptop.connect(40);
	System.out.println("start main in Laptop");
	}
}
