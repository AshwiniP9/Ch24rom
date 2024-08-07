/*Clip --> color,type --> init this using Const
declare details()
Ganavi---> email,Clip--> init this using Const
declare details()*/
class Clip{
	String color;
	String type;
	Clip(String color,String type){
		this.color=color;
		this.type=type;
		
	}
	 void details(){
		System.out.println("color:"+color);
		System.out.println("type:"+type);
		
	}
	
	
}