class KeyBunch{
	String meterial;
	Keyn key;
	//Key key=new Key()
	KeyBunch(String meterial,Keyn key){
		this.meterial=meterial;
		this.key=key;
		
	}
	public void details(){
	System.out.println("meterial:"+meterial);	
		key.details();
	}
	public static void main(String[] args){
	Keyn key=new Keyn(5.7,"evil key");
	KeyBunch keyBunch=new KeyBunch("metal",key);
	keyBunch.details();
		
		
	}
	

}