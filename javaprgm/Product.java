//Product :
//1. Declare a method which return product name
//2. Declare a method which return product price
//3. Declare a method which return product quantity
//4. Declare a method which return product quality
//5. Declare a method which return product manf... date
//6. Declare a method which return product brand

class Product{
	
	public static String pName(String name){
	System.out.println("strating Pname in product");
	return name;
	}
	public static int pPrice(int price){
	System.out.println("strating Pprice in product");
	return price;	
	}
	public static int pQuantity(int quantity){
	System.out.println("strating Pquantity in product");
	return quantity;
    }
	public static int pQuality(int quality){
	System.out.println("strating Pquantity in product");
	return quality;
    }
	public static String manufactureDate(String date){
	System.out.println("strating Pquantity in product");
	return date;
    }
	public static String pBrand(String brand){
	System.out.println("strating Pquantity in product");
	return brand;
    }
	public static void main(String[] args){
	System.out.println("strating main in product");
	String name=Product.pName("ash");
	int price=Product.pPrice(90);
	String date=Product.manufactureDate("2/5/24");
	int quantity=Product.pQuantity(3);
	int quality=Product.pQuality(9);
	String brand=Product.pBrand("puma");
	System.out.println("product name:"+name);
	System.out.println("product price:"+price);
	System.out.println("product quantity:"+quantity);
	System.out.println("product quality:"+quality);
	System.out.println("product manufactureDate:"+date);
	System.out.println("product brand:"+brand);
	System.out.println("end main in product");
		
	}
}