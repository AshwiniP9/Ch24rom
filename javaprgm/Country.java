class Country{
	String name;
	String continent;
	State state=new State("karnataka","kannada");
	void details(){
	System.out.println("country name:"+this.name);
	System.out.println("country continent:"+this.continent);
	state.details();
	}
	public static void main(String[] args){
	Country country=new Country();
	country.name="indea";
	country.continent="asia";
	country.details();

	
	
}



}