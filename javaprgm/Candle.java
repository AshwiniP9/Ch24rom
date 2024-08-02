class Candle{
	double length;
	double price;
	String fragrance;
	
	Candle(){
	
	System.out.println("constructor no parameter");
	}
	Candle(double length){
		System.out.println("constructor have length");
		this.length=length;
		System.out.println("length of Candle:"+length);
	
	}
	Candle(double length,double price){
		System.out.println("constructor have length ,price.....");
		this.length=length;
		this.price=price;
		System.out.println("length of Candle:"+length);
	    System.out.println("price of Candle:"+price);
	}
	Candle(String fragrance,double length){
	System.out.println("constructor have fragrance ,price.....");
		this.fragrance=fragrance;
		this.length=length;
		System.out.println("length of Candle:"+length);
		System.out.println("fragrance of Candle:"+fragrance);

	}
	Candle(String fragrance,double length,double price){
	System.out.println("constructor have fragrance ,price and length.....");
		this.fragrance=fragrance;
		this.length=length;
		this.price=price;
		System.out.println("length of Candle:"+length);
		System.out.println("fragrance of Candle:"+fragrance);
		System.out.println("price of Candle:"+price);

	}
	public static void main(String[] args){
	Candle candle=new Candle();
	Candle candle1=new Candle(3.5);
	Candle candle2=new Candle(3.5,50);
	Candle candle3=new Candle("rose",3.5);
	Candle candle4=new Candle("rose",3.5,50);
	//Candle candle5=new Candle(3.5);
	
		
		
	}

}