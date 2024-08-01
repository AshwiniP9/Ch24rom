class Cable {
    String manufacturer = "Generic"; 
    int price; 
    String category; 
    String wiretype; 
    
    
    Cable(String categoryLocal, int priceLocal) {
        category = categoryLocal;
        price = priceLocal;
        System.out.println("Cable category is = " + category);
        System.out.println("Cable wiretype is = " + wiretype); 
        System.out.println("Cable price is = " + price);
    }
	Cable(){
		
		
	}
}