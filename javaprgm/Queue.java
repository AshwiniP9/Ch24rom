class Queue{
	static String accept(String name1,String msg1,int quantity){
	System.out.println("start accept in Queue");
	ServiceProvider.send(name1,msg1);
	if(name1=="Ambani" && msg1=="Do well"){
	System.out.println("name:"+name1);
	System.out.println("msg:"+msg1);	
	System.out.println("quantity:"+quantity);
    String sendmsg="sent";	
	System.out.println ("message is:"+sendmsg);
	return sendmsg;
	}
	String sendmsg1="Not";	
	System.out.println ("message is:"+sendmsg1);
	return sendmsg1;
		
	}	
		
	

}