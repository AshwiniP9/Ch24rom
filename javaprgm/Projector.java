/*Init properties using 4 different ways
Declare a method to print all instance variables
Create least 3 copies


Projector: company,type,color,weight
*/
class Projector{
	public static void main(String[] args){
	Projector projector=new Projector("large");
	projector.buy(8.0);
	projector.order();
	Projector projector1=new Projector("small");
	projector1.brand="sony";
	projector1.buy(5.7);
	projector1.setColor("red");
	projector1.order();
	Projector projector2=new Projector("large");
	projector2.setColor("black");
	projector2.order();
}
String brand="nokey";
String color;
String type;
double weight; 	
public	Projector(String type){
        this.type = type;
}	
 void buy(double weight){
		this.weight=weight;
			
}
public void setColor( String color){
	this.color=color;
	
}
public void order(){
	System.out.println("speaker brand:"+brand);
	System.out.println("speaker size:"+weight);
	System.out.println("speaker output:"+color);
	System.out.println("speaker cost:"+type);
	 System.out.println("=======================================");
}

	
	
}