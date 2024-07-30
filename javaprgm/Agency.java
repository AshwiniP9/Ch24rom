class Agency{
	public static boolean advanceBook(){
		System.out.println("start advanceBooked in Agency");
		boolean ref=Company.booked();
		System.out.println("end advanceBooked in Agency");
		return ref;

	}
}