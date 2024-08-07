/*Knife--> weight,height--> init this using Const
declare details()
Ananya---> mobile,Knife --->init this using Const
declare details()*/
class Knife{
	double weight;
	double height;
	Knife(double weight,double height){
		this.weight=weight;
		this.height=height;
		
	}
	void details(){
		System.out.println("weight:"+weight);
		System.out.println("height:"+height);
	}
	
	
}