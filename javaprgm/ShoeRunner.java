class ShoeRunner{
	public static void main (String[] args){
		System.out.println("start main in ShoeRunner");
		double price1=ShoeShop.purchase("puma");
		System.out.println("price1:"+price1);
		double price2=ShoeShop.purchase("nike");
		System.out.println("price2:"+price2);
		double price3=ShoeShop.purchase("bata");
		System.out.println("price3:"+price3);

		System.out.println("end main in ShoeRunner");
		
		}


}