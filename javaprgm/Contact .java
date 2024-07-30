//Contact Class with Below Method
//1. Method to take name: least 15 and return mobile no: 0
class Contact{
	
	static double mobileNumber(String name){
	if(name=="hari")
	{
	System.out.println("start mobileNumber in Contact");
	System.out.println("contact name:"+name);
	return 7760608031;	
	}
System.out.println("end of service,thank you for visiting.");
 return 0;	
	
	
}
	
    public static void main(String[] args)
{
	System.out.println("start main in contact");
	double ref1=Contact.mobileNumber("hari");
    System.out.println("name:"+ref1);
	}
	
}

