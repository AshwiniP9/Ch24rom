class CoffeeBar{
	
public static void 	sellCoffee(String name,int money){
	System.out.println("start makecoffee in staff");
    System.out.println("item:"+name);
	System.out.println("cost:"+money);
	Staff.makeCoffee(name,money);
	System.out.println("start makecoffee in staff");

}
}