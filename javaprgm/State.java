class State{
	String name;
	String language;
	Capitalcity capitalcity1=new Capitalcity();
	State(String name,String language){
		this.name=name;
		this.language=language;
	}
	void details(){
		
	System.out.println("State name:"+this.name);
	System.out.println("language:"+this.language);
	capitalcity1.name="is good";
	capitalcity1.population= 15600900;
	this.capitalcity1.details();

	}


}