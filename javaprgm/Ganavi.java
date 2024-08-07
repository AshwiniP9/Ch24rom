class Ganavi{
	String email;
	Clip clip;
	
	Ganavi(String email,Clip clip){
		this.email=email;
		this.clip=clip;
		
	}
	public void details(){
	System.out.println("email:"+email);	
		clip.details();
	}
	public static void main(String[] args){
	Clip clip=new Clip("red","small");
	Ganavi ganavi=new Ganavi("ganavi@gmail.com",clip);
	ganavi.details();
		
		
	}
	

}