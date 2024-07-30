class ServiceProvider{
	static boolean send(String name,String msg){
		System.out.println("start send in ServiceProvider");
		boolean ref1=MessageProvider.send(name,msg);
		//System.out.println("name:"+name);
	    //System.out.println("msg:"+msg);
		System.out.println("end send in ServiceProvider");
		return ref1;


}


}