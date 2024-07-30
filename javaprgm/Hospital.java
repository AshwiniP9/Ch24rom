//Hospital
//1. Declare a method which return name
//2. Declare a method which return specilization
//3. Declare a method which return area
//4. Declare a method which return open time
//5. Declare a method which return close time
//6. Declare a method which return generalconsulting
//Declare a class , and write 5 method to write some information

class Hospital{
	static String hospitalName(String name){
	System.out.println("strating Hospitalname in Hospital");
	return name;
	}
	static String specilization(String specilization){
	System.out.println("strating specilization in Hospital");
	return specilization;
	}
	static String area(String area){
	System.out.println("strating area in Hospital");
	return area; 
	}
	static String open(String otime){
	System.out.println("strating open in Hospital");
	return otime; 
	}
	static String close(String ctime){
	System.out.println("strating close in Hospital");
	return ctime; 
	}
	static int generalconsulting(int fee){
	System.out.println("strating specilization in Hospital");
	return fee; 
	}
	public static void main(String[] args){
	System.out.println("strating main in Hospital");
	String name=Hospital.hospitalName("sparsh");
	System.out.println("hospitalName :"+name);
	String specile=Hospital.specilization("cadiologist");
	System.out.println("specilization :"+specile);
	String openTime=Hospital.open("9 am ");
	System.out.println("time :"+openTime);
	String closeTime=Hospital.close("10 pm");
	System.out.println("closeTime :"+closeTime);
	int generalconsulting=Hospital.generalconsulting(500);
	System.out.println("generalconsulting :"+generalconsulting);
	String location=Hospital.area("8th mile,bengalore");
	System.out.println("area :"+location);
	
	
	}
}