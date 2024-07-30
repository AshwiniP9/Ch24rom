class WalletRunner{
	public static void main(String [] args){
	System.out.println("start main in walletRunner");
	Wallet wall=new Wallet();
	System.out.println("wallet brand:"+wall.brand);
	System.out.println("wallet cost:"+wall.cost);
	wall.brand="max";
	wall.cost=600;
	System.out.println("wallet brand:"+wall.brand);
	System.out.println("wallet cost:"+wall.cost);
	System.out.println("----------------------------------------------------------");	
	Spactula spact=new Spactula();
	System.out.println("Spactul meterial:"+spact.meterial);
	System.out.println("spact cost:"+spact.cost);
	spact.meterial="alumium";
	spact.cost=800;
	System.out.println("Spactul meterial:"+spact.meterial);
	System.out.println("spact cost:"+spact.cost);
	System.out.println("----------------------------------------------------------");	
	IronBox box=new IronBox();
	System.out.println("IronBox brand:"+box.brand);
	System.out.println("IronBox mode:"+box.mode);
	box.brand="phillips";
	box.mode="hot";
	System.out.println("IronBox brand:"+box.brand);
	System.out.println("IronBox mode:"+box.mode);
	System.out.println("----------------------------------------------------------");
	Pillow pillow=new Pillow();
	System.out.println("Pillow shape: " + pillow.shape);
    System.out.println("Pillow cost: " + pillow.cost);
	pillow.shape = "square";
    pillow.cost = 299;
	System.out.println("Pillow shape: " + pillow.shape);
    System.out.println("Pillow cost: " + pillow.cost);
	System.out.println("----------------------------------------------------------");

	Mirror mirror = new Mirror();
	System.out.println("Mirror frame color: " + mirror.frameColor);
    System.out.println("Mirror cost: " + mirror.cost);	
	mirror.frameColor = "Silver";
    mirror.cost = 890;
	System.out.println("Mirror frame color: " + mirror.frameColor);
    System.out.println("Mirror cost: " + mirror.cost);	
	

	System.out.println("end main in walletRunner");
	
	

	
	
	
	
	}


}