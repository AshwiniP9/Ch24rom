class Swiggy {

public static String order(String name){
	System.out.println("start order in Hotel_taj");
	Hotel_taj.getItem(name);
	System.out.println("start order in Hotel_taj");
	return "ok";
}

}