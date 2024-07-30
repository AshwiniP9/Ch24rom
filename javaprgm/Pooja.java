class Pooja{
public static String foodOrder(String orderName){
	System.out.println("start foodOrder in Hotel_taj");
	Swiggy.order(orderName);
	System.out.println("start foodOrder in Hotel_taj");
	return "ok";
}

}