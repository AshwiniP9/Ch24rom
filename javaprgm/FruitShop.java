class FruitShop{
	
	int appleCostPerKg=180;
	int mangoCostPerKg=80;

	
	public int buying(String fruit,int weight){
		
		int cost=0;
		if(fruit=="apple"){
				 cost=appleCostPerKg*weight;
			
		return cost;

		}
		if(fruit=="mango"){
				 cost=appleCostPerKg*weight;
			
		return cost;

		}
		return cost;
		

}
}