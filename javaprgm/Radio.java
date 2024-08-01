class Radio {
    String manufacturingDate = "1/08/2024"; 
    int price; 
    String color; 
    String brand; 
    
    
    Radio(String colorlocal, int priceLocal) {
        color = colorlocal;
        price = priceLocal;
        System.out.println("Cable category is = " + color);
        System.out.println("Cable wiretype is = " + manufacturingDate); 
        System.out.println("Cable price is = " + price);
    }
	Radio(){
		
		
	}
}