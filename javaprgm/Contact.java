//Contact Class with Below Method
//1. Method to take name: least 15 and return mobile no: 0
class Contact{
	
	static long mobileNumber(String name){
	if(name=="hari")
	{
	System.out.println("start mobileNumber in Contact");
	System.out.println("contact name:"+name);
	return 7760608031L;	
	}
	if(name=="sonu")
	{
	System.out.println("start mobileNumber in Contact");
	System.out.println("contact name:"+name);
	return 7760608081L;	
	}
	if(name=="pooja")
	{
	System.out.println("start mobileNumber in Contact");
	System.out.println("contact name:"+name);
	return 9760608031L;	
	}
	if(name=="anu")
	{
	System.out.println("start mobileNumber in Contact");
	System.out.println("contact name:"+name);
	return 7860608031L;	
	}
	if(name=="darshan")
	{
	System.out.println("start mobileNumber in Contact");
	System.out.println("contact name:"+name);
	return 86185258051L;	
	}
	if(name=="arya")
	{
	System.out.println("start mobileNumber in Contact");
	System.out.println("contact name:"+name);
	return 9960808031L;	
	}
	if(name=="bhargi")
	{
	System.out.println("start mobileNumber in Contact");
	System.out.println("contact name:"+name);
	return 9760608078L;	
	}
	if(name=="kavana")
	{
	System.out.println("start mobileNumber in Contact");
	System.out.println("contact name:"+name);
	System.out.println("end mobileNumber in Contact");

	return 9907456768L;	
	}
	if(name=="karna")
	{
	System.out.println("start mobileNumber in Contact");
	System.out.println("contact name:"+name);
	System.out.println("end mobileNumber in Contact");

	return 9113586026L;	
	}
	if(name=="ash")
	{
	System.out.println("start mobileNumber in Contact");
	System.out.println("contact name:"+name);
	System.out.println("end mobileNumber in Contact");

	return 9013586029L;	
	}
	
System.out.println("end of service,thank you for visiting.");
 return 0L;	
	
	
}
	
    public static void main(String[] args)
{
	System.out.println("start main in contact");
	long ref1=Contact.mobileNumber("hari");
    System.out.println("name:"+ref1);
	long ref2=Contact.mobileNumber("sonu");
    System.out.println("name:"+ref2);
	long ref3=Contact.mobileNumber("arya");
    System.out.println("name:"+ref3);
	long ref4=Contact.mobileNumber("kavana");
    System.out.println("name:"+ref4);
	long ref5=Contact.mobileNumber("karna");
    System.out.println("name:"+ref5);
	long ref6=Contact.mobileNumber("darshan");
    System.out.println("name:"+ref6);
	long ref7=Contact.mobileNumber("bhargi");
    System.out.println("name:"+ref7);
	long ref8=Contact.mobileNumber("anu");
    System.out.println("name:"+ref8);
	long ref9=Contact.mobileNumber("pooja");
    System.out.println("name:"+ref9);
	long ref10=Contact.mobileNumber("ash");
    System.out.println("name:"+ref10);
	}
	
}

