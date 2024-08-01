class WatchRunner{
	public static void main(String [] args){
	Watch watch=new Watch("male",600);
	Watch watch1=new Watch();
	watch1.meterial="alumiun";
	//watch1.type="female";
	//System.out.println("watch type is ="+watch1.type);
	System.out.println("watch meterial is updated ="+watch1.meterial);
	System.out.println("watch brand is ="+watch.brand);
	System.out.println("watch cost is ="+watch.cost);
	System.out.println("-----------------------------");


	Cable cable = new Cable("HDMI", 20);
	Cable cable1=new Cable();
	cable1.wiretype="copper";
	System.out.println("Cable wiretype is = " +cable1.wiretype); 
	System.out.println("Cable price is = " +cable.price); 
	System.out.println("Cable category is = " +cable.category); 
	System.out.println("Cable manufacturer is = " +cable.manufacturer); 

	System.out.println("-----------------------------");


	Radio radio = new Radio("black", 20);
	Radio radio1=new Radio();
	radio1.brand="boat";
	System.out.println("Radio brand is = " +radio1.brand); 
	System.out.println("Radio brand is = " +radio.price); 
	System.out.println("Radio color is = " +radio.color); 
	System.out.println("Cable manufacturingDate is = " +radio.manufacturingDate); 





	
	
	}

}