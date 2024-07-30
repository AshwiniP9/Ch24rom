class ShoeFactory{
	static double order(String brand){
		System.out.println("start price in ShoeFactory");
		//System.out.println("price:"+price);
		System.out.println("end price in ShoeFactory");
		if(brand=="puma"){
		System.out.println("Shoe is puma");
			return 1500;
		}
		if(brand=="nike"){
		System.out.println("Shoe is nike");

			return 2000;
		}
		return 0;
	
	}

}