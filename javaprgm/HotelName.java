class HotelName{
	String name="Taj";
	Owner owner=new Owner("Jamsetji Tata",54,'m');
	void details(){
	System.out.println("hotel name:"+this.name);
	this.owner.details();
		
	}
public static void main(String[] args){
	HotelName hotelName=new HotelName();
	hotelName.details();
	
}


}