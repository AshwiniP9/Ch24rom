/*Hotel Class with Below Methods

//1. MEthod to take item and give price: "Not Found": Least 2 items : Idli,Vada
//2. Method to take quantity and return yes or no : quantity is greater that 1 and less that 10 return yes else no

//Saloon Class with Below Methods

//1. Method to take service:haircut,spa,facial,pedicure,headmassage,haircolor,trimming and return price : -1

//Contact Class with Below Method
1. Method to take name: least 15 and return mobile no: 0*/
class Hotell{
	static String item(double price){
	System.out.println("start item in Hotel1");
	if(price==30)
	{
	System.out.println("end item in Hotel1");
	System.out.println("item is:");
	return "idli";
	}
	if(price==20){
	System.out.println("start item in Hotel1");
	System.out.println("item is:");
	return "vada";
	}
	return "not matching";
	}
	static String quantity(double quan){
	if(quan>1 && quan<10)
	{
	System.out.println("===============================================");
    System.out.println("star quantity in hotel1");
	System.out.println("quantity is:");
	return "yes";
	}
	System.out.println("end quantity in hotel1");
	return "no";
	}
	
	public static void main(String[] args)
	{
    
	System.out.println("start main in Hotel1");
	String ref1=Hotel1.item(30);
    System.out.println(ref1);
	String ref2=Hotel1.item(20);
    System.out.println(ref2);
	String ref3=Hotel1.item(35);
    System.out.println(ref3);
	String ref4=Hotel1.quantity(5);
    System.out.println(ref4);
	String ref5=Hotel1.quantity(11);
    System.out.println(ref5);
	System.out.println("end main in Hotel1");
	}		
}

