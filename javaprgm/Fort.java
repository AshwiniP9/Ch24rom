class Fort{
static String location(String name){
if(name=="mysoore"){
System.out.println("fort is mysoore");
}
if(name=="delhi"){
System.out.println("fort is delhi");
}
if(name=="bidar"){
System.out.println("fort is bidar");
}
return "not match";
}
static double fee(String fortName){
	if(fortName=="bengalure"){
		System.out.println("fortName is bengalure");
		return 50;
	}
	if(fortName=="redfort"){
		System.out.println("fortName is redfort");
		return 60;
	}
	if(fortName=="chitardurga"){
		System.out.println("fortName is chitardurga");
		return 100;
	}
	if(fortName=="ambavilasplace"){
		System.out.println("fortName is ambavilasplace");
		return 120;
	}
	if(fortName=="tipufort"){
		System.out.println("fortName is tipufort");
		return 40;
	}
	return -1;
}
public static void main(String[] args){
	System.out.println("star main in fort");
	String ref1=Fort.location("mysoore");
	System.out.println("ref1 :"+ref1);
	double ref2=Fort.fee("chitardurga");
	System.out.println("ref :"+ref2);
    System.out.println("end main in fort");

	
}
}