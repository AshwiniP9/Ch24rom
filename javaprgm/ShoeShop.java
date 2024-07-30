class ShoeShop{
	static double purchase(String brandname){
		System.out.println("start price in ShoeShop");
		double price=ShoeFactory.order(brandname);
		System.out.println("end price in ShoeShop");
		return price;
		}


}