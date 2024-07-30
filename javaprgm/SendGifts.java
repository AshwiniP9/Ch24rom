class SendGifts{
	public static void sendGift(String name,int price,String date,boolean urgent){
		System.out.println("start sendGift in SendGifts");
		System.out.println("gift:"+name);
		System.out.println("date:"+date);
		System.out.println("urgent:"+urgent);
		System.out.println("price:"+price);
		Assignment.assign(name,price,date,urgent);
        System.out.println("end sendGift in sendGifts");
	}


}