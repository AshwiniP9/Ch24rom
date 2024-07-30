//1. Write a MedicalShop class with below methods
//a. Method to take medicinename
//b. Method to take medicine name and quantity
//c. Method to take customerName,email,mobileNo,address
//d. Method to take customerName,mobileNo

class MedicalShop {
static void bill(String medicinename)
{
System.out.println("start bill in MedicalShop");	
System.out.println("medicinename :"+medicinename);	
System.out.println("end bill in MedicalShop");	
}
static void bill(String medicinename,int quantity)
{
System.out.println("start bill in MedicalShop");	
System.out.println("medicinename :"+medicinename);
System.out.println("quantity :"+quantity);	
System.out.println("end bill in MedicalShop");	
}
static void bill(String customerName,long mobileNo)
{
System.out.println("start bill in MedicalShop");	
System.out.println("customerName :"+customerName);	
System.out.println("mobileNo :"+mobileNo);	
System.out.println("end bill in MedicalShop");	
}
static void bill(String customerName, String email,long mobileNo,String address)
{
System.out.println("start bill in MedicalShop");	
System.out.println("customerName :"+customerName);	
System.out.println("email :"+email);	
System.out.println("mobileNo :"+mobileNo);	
System.out.println("address :"+address);	
System.out.println("end bill in MedicalShop");	
}

public static void main(String[] args)
{
System.out.println("start main in MedicalShop");
bill("paracetamole");
bill("cipla");
String mac="dolo";
bill(mac);	
bill("paracetamole",9);
bill("cipla",8);
int b=7;
String a="dolo";
bill(a,b);
bill("ash",9135886026L);
bill("raju","raju12@gmail.com",7865988658L,"#12 geetaneelaya, madavara bengalore");
bill("ash","ashwini12@gmail.com",9113586026L,"#23 ash badavane,madavara,bengalore");
String d="darshan";
String f="darshan@gmail.com";
long mN=861858520L;
String h="mysoore";
bill(d,f,mN,h);
System.out.println("start main in MedicalShop");	
}

	}
