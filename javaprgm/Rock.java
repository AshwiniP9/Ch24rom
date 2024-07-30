//Write a class with below method and validate primitives

//1. MEthod to take age for voting
//2. Method to take age and name for marriage
//3. MEthod to take height,weight,age for Police Service
//4. MEthod to take price,quantity,pincode,mobile for a product
//5. MEthod to take aadhar no for verification



class Rock {
	static void vAge(int votingAge){
		if(votingAge>=18){
			System.out.println(starting vage in rock);
			System.out.println(valid age is voting);
			System.out.println(end vage in rock);			
		}
			
	}
	static void mAge(int marriage_age){
		if(marriage_age>=18){
		System.out.println(starting vage in rock);
		System.out.println(valid age is marriage);
        System.out.println(end vage in rock);
		}
	}	
	static void policeService(double height,double weight,int age,string name){
		
		if(height>0 && height<=8){
		System.out.println(starting policeService in rock);
		System.out.println(valid age is height);
        System.out.println(end policeService in rock);}
		else(weight>0 && weight<=60){
		System.out.println(starting policeService in rock);
		System.out.println(valid weight is policeService);
        System.out.println(end policeService in rock);
		}
	}
		else(age>21 && age<35)	{
		System.out.println(starting policeService in rock);
		System.out.println(valid age is policeService);
        System.out.println(end policeService in rock);
		}
	static void adar(long adarnumber){
		if(adarnumber[]<13){
		System.out.println(starting adar in rock);
		System.out.println(valid number is policeService);
      	System.out.println(end adar in rock);}
	}	
	static void product(int price,int quantity,int pincode,int mobile)
	{
		System.out.println(starting product in rock);
        System.out.println(end policeService in rock);
	}
	
	public static void main(String[] args)
	{
		vAge(20);
		mAge(23);
		policeService(4,50,35,ashwini);
		adar([235644847775]);
		product(45,5,562123,9113586026);
		
	}
}