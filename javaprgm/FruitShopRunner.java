class FruitShopRunner{
public static void main(String[] args){
FruitShop fruitShop=new FruitShop();
int price=fruitShop.buying("apple",2);
System.out.println("apple="+price);
FruitShop fruitShop1=new FruitShop();
int price1=fruitShop.buying("mango",8);
System.out.println("mango="+price1);


}

}