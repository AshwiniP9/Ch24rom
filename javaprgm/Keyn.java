/*Key: weight,brand--> init this using Const
declare details()
Keybunch ---> material,Key--->init this using Const
declare details()


Clip --> color,type --> init this using Const
declare details()
Ganavi---> email,Clip--> init this using Const
declare details()

Knife--> weight,height--> init this using Const
declare details()
Ananya---> mobile,Knife --->init this using Const
declare details()*/
class Keyn{
	double weight;
	String brand;
	public Keyn(double weight,String brand){
		this.weight=weight;
		this.brand=brand;
	}
	void details()
	{
	System.out.println("weight:"+this.weight);
	System.out.println("brand:"+this.brand);
	}
	
}