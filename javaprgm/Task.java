//Every method should have start and end MEssage
//Every variable stored , should be printed

//1.Hair : length,color,style,volume,type...
//2.Cloth: brand,type,color,cost,quality,size....
//3.Soap : brand,color,size,quantity,price,manfDate
//4.Chappal: size,brand,color,gender,cost
//5.Milk : price,brand,quality,quantity,packetType


class Task{
static void hair()
{
System.out.println("Start with Hair...............................");
double lengthInMeter=20.00;
System.out.println("lengthInMeter"+lengthInMeter);
String color="black";
System.out.println("color : "+color);
String style="layer";
System.out.println("style: "+style);
double volumeInMeter=0.6;
System.out.println("volumeInMeter: "+volumeInMeter);
String type="straight";
System.out.println("type: "+type);
System.out.println("end with Hair..................................");
} 
static void cloth(){
System.out.println("Start with cloth..............................");
String brand="puma";
System.out.println("brand: "+brand);
String type="cotton";
System.out.println("type: "+type);
String color="blue";
System.out.println("color: "+color);
int cost=2000;
System.out.println("cost: "+cost);
String quality="Good";
System.out.println("quality: "+quality);
double sizeInMeter=7.9;
System.out.println("sizeInMeter: "+sizeInMeter);
System.out.println("end with cloth............................");
}
static void soap(){
System.out.println("Start with soap............................");
//3.Soap : brand,color,size,quantity,price,manfDate
String brand="mysoore sandal";
System.out.println("brand: "+brand);
String color="golden";
System.out.println("color: "+color);
double sizeInMeter=3.7;
System.out.println("sizeInMeter: "+sizeInMeter);
String quantity="medium";
System.out.println("quantity: "+quantity);
int cost=40;
System.out.println("cost: "+cost);
int manfDate= 20/4/2024;
System.out.println("manfDate: "+manfDate);
System.out.println("end with soap.............................");
}	
static void chappal(){
System.out.println("Start with chappal.......................");
String brand="puma";
System.out.println("brand: "+brand);
String color="blue";
System.out.println("color: "+color);
int cost=2000;
System.out.println("cost: "+cost);
String quality="Good";
System.out.println("quality: "+quality);
double sizeInInch=7.00;
System.out.println("sizeInInch: "+sizeInInch);
String gender="female";
System.out.println("gender: "+gender);
System.out.println("end with chappal...........................");
}	
//5.Milk : price,brand,quality,quantity,packetType



class Run{
	
	public  void runMain()
	{
       Task.hair();
Task.soap();
Task.chappal();
Task.cloth();
	}
}	
public static void main(String[] args){
Task.Run refName= new Task().new Run();
System.out.println("'start with main'");
refName.runMain();
System.out.println("'end with main'");
}	
}





