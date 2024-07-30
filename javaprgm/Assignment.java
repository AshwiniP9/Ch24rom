class Assignment{
	public static void assign(String gift,int price,String date,boolean urgent){
		System.out.println("start assign in Assignment");
		System.out.println("gift:"+gift);
		System.out.println("date:"+date);
		System.out.println("urgent:"+urgent);
		System.out.println("price:"+price);
		Deliver.deliver(gift,date,urgent);
        System.out.println("end assign in Assignment");
	}
}