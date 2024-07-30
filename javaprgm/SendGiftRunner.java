class SendGiftRunner{
public static void main(String[] args){
	System.out.println("start main in SendGiftsRunner");
	SendGifts.sendGift("doll",90,"1/2/2024",true);
	SendGifts.sendGift("watch", 2000,"7/12/2024",true);
	SendGifts.sendGift("iphone",56000,"9/2/2024",true);
	SendGifts.sendGift("Goldring",70000,"7/2/2024",false);
	SendGifts.sendGift("dress",1000,"8/2/2024",true);
	SendGifts.sendGift("frame",500,"1/2/2024",true);
	SendGifts.sendGift("chain",9000,"9/7/2024",true);
	SendGifts.sendGift("car",900000,"1/2/2024",false);
	SendGifts.sendGift("lipstick",600,"4/6/2024",true);
	SendGifts.sendGift("earbuds",1000,"2/7/2026",false);
	System.out.println("end main in SendGiftsRunner");


}


}