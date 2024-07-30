class Customer{
	public static boolean travel(){
		System.out.println("start travel in Customer");
		boolean ref1=Agency.advanceBook();
		System.out.println("end travel in Customerus");
		return ref1;

	}
}