class Owner{
	String name;
	int age;
	char gender;

	
	Owner(String name,int age,char gender){
	this.name=name;
	this.age=age;
	this.gender=gender;

	}
	void details(){
	System.out.println("owner name:"+this.name);
	System.out.println("age:"+this.age);
	System.out.println("gender:"+this.gender);
	}

}