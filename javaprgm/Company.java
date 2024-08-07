class Company{
	String name;
	String id;
	String location;
	SoftwareEngineer softwareEngineer=new SoftwareEngineer("ashwini",5,"software developer",50);
	Company(String name,String id,String location){
		this.name=name;
		this.id=id;
		this.location=location;
	}
	void details(){
	System.out.println("company name:"+this.name);
	System.out.println("company id:"+this.id);
	System.out.println("company location:"+this.location);

	this.softwareEngineer.details();
		
	}
public static void main(String[] args){
	Company company=new Company("IBM","1Imbash","bengalore");
	company.details();

	
	
}


}