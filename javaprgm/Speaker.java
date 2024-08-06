/*Init properties using 4 different ways
Declare a method to print all instance variables
Create least 3 copies

Speaker : brand,size,cost,output
Rocket: country,speed,fuelCapacity,noOfThrusters
Chocolate: brand,price,flavour,size
Projector: company,type,color,weight
Paper : thickness,size,quality,color*/

class Speaker{
	public static void main(String[] args){
	Speaker speaker=new Speaker("large");
	speaker.buy("good");
	speaker.order();
	Speaker speaker1=new Speaker("small");
	speaker1.brand="sony";
	speaker1.buy("fine");
	speaker1.setCost(1000);
	speaker1.order();
	Speaker speaker2=new Speaker("large");
	speaker2.setCost(6000);
	speaker2.order();
}
String brand="boat";
String size;
String output;
double cost; 	
public	Speaker(String size){
        this.size = size;
}	
 void buy(String output){
		this.output=output;
			
}
public void setCost(double cost){
	this.cost=cost;
	
}
public void order(){
	System.out.println("speaker brand:"+brand);
	System.out.println("speaker size:"+size);
	System.out.println("speaker output:"+output);
	System.out.println("speaker cost:"+cost);
	 System.out.println("=======================================");
}

	
	
}