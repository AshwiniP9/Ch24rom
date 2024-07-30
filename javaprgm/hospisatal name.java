//Hospital
//1. Declare a method which return name
//2. Declare a method which return specilization
//3. Declare a method which return area
//4. Declare a method which return open time
//5. Declare a method which return close time
//6. Declare a method which return generalconsulting
//Declare a class , and write 5 method to write some information

class Hospital{
	static String hospitalName(Strinng name){
	System.out.println("strating Hospitalname in Hospital");
	return name;
	}
	static String specilization(Strinng specilization){
	System.out.println("strating specilization in Hospital");
	return specilization;
	}
	static String area(Strinng area){
	System.out.println("strating area in Hospital");
	return area; 
	}
	static String open(Strinng otime){
	System.out.println("strating open in Hospital");
	return otime; 
	}
	static String close(Strinng ctime){
	System.out.println("strating area in Hospital");
	return ctime; 
	}
	static String generalconsulting(Strinng fee){
	System.out.println("strating area in Hospital");
	return area; 
	}
	public static void main(String[] args){
	System.out.println("strating main in Hospital");
	String name=Hospital.hospitalName("sparsh");
	System.out.println("hospitalName :"+hospitalName);
	
	}
}