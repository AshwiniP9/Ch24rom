class SoftwareEngineer{
	String name;
	int experience;
	String designation;
	int salary;
	SoftwareEngineer(String name,int experience,String designation,int salary){
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	void details(){
	System.out.println("developer name:"+this.name);
	System.out.println("experience:"+this.experience+" years");
	System.out.println("designation:"+this.designation);
	System.out.println("salary:"+this.salary+"K");
		
		
	}

}