//Saloon Class with Below Methods
//1. Method to take service:haircut,spa,facial,pedicure,headmassage,haircolor,trimming and return price : -1

class Saloon{
	public static double price(String service ){
	System.out.println("start price in Saloon");
	if(service=="haircut"){
	System.out.println("start service:");
	System.out.println("service:"+service);
	System.out.println("end of service,thank you for visiting.");
	return 120;
	}
	if(service=="spa"){
	System.out.println("start service:");
	System.out.println("service:"+service);
	System.out.println("end of service,thank you for visiting.");
	return 300;
	}
	if(service=="facial"){
	System.out.println("start service:");
	System.out.println(" service:"+service);
	System.out.println("end of service,thank you for visiting.");
	return 400;
	}
	if(service=="pedicure"){
	System.out.println("start service:");
	System.out.println(" service :"+service);
	System.out.println("end of service,thank you for visiting.");
	return 250;
	}
	if(service=="headmassage"){
	System.out.println("start service:");
	System.out.println(" service:"+service);
	System.out.println("end of service,thank you for visiting.");
	return 125;
	}
	if(service=="haircolor"){
	System.out.println("start service:");
	System.out.println("service:"+service);
	System.out.println("end of service,thank you for visiting.");
	return 500;
	}
	if(service=="trimming"){
	System.out.println("start service:");
	System.out.println(" service:"+service);
	System.out.println("end of service,thank you for visiting.");
	return 150;
	}
	System.out.println("end of service,thank you for visiting.");
	return -1;
	
	}	
public static void main(String[] args)
{
	System.out.println("start main in Saloon");
	double ref1=Saloon.price("haircut");
    System.out.println("price of service:"+ref1);
	System.out.println("start main in Saloon");
	double ref2=Saloon.price("headmassage");
    System.out.println("price of service:"+ref1);
	System.out.println("start main in Saloon");
	double ref3=Saloon.price("haircolor");
    System.out.println("price of service:"+ref1);
	System.out.println("start main in Saloon");
	double ref4=Saloon.price("spa");
    System.out.println("price of service:"+ref1);
	System.out.println("start main in Saloon");
	double ref5=Saloon.price("pedicure");
    System.out.println("price of service:"+ref1);
	System.out.println("start main in Saloon");
	double ref6=Saloon.price("trimming");
    System.out.println("price of service:"+ref1);
	System.out.println("start main in Saloon");
	double ref7=Saloon.price("facial");
    System.out.println("price of service:"+ref1);
	System.out.println("start main in Saloon");
	double ref8=Saloon.price("hairstyle");
    System.out.println("price of service:"+ref8);
    System.out.println("end main in Saloon");
}
	
}
