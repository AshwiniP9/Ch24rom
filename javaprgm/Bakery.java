class Bakery{
static void bake(){
	System.out.println("Running bake in Bakery");
	Chef.cook();
}
static void cake(){
	System.out.println("Running cake in Bakery");
	Assistant.assist();
	Chef.cook();
	
}
static void sell(){
	System.out.println("Running sell in Bakery");
}
}