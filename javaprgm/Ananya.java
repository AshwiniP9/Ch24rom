class Ananya{
	long mobile;
	Knife knife;
	
	Ananya(long mobile,Knife knife){
		this.knife=knife;
		this.mobile=mobile;
		
	}
	public void details(){
	System.out.println("mobile:"+mobile);	
		knife.details();
	}
	public static void main(String[] args){
	Knife knife=new Knife(5.6,3.5);
	Ananya ananya=new Ananya(9113586026L,knife);
	ananya.details();
		
		
	}
	


}