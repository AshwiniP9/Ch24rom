/*Email-->sendMsg(String msg)--->Person-->read(msg);

Main--> Email.sendMsg("Good Day!!")
================
Laptop--->connect(int speed)--->Router.network(speed)-->Provider-->provide(speed)

Main--> Laptop.connect(40);


NOTE: return is void only*/
class Person{
	public static void read(String message){
	System.out.println("start read in person");	
	System.out.println("message:"+message);	
	System.out.println("end read in person");		
}
}
class Email{
	public static void sendMsg(String msg){
	System.out.println("start sendMsg in Email");
    Person.read(msg);	
	System.out.println("end sendMsg in Email");	

}
}
 class EmailRunner{  
     public static void main(String[] args)
	{
	System.out.println("start main in EmailRunner");
    Email.sendMsg("Good day!!");
	System.out.println("end main in EmailRunner");
	}
}


