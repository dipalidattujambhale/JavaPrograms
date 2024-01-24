package classandobject;

public class Arithmetic {
	
	    //create one class arithmatic and perform all arithmatic operation create separated method for each operation 
	int a=10;
	int b=20;
	int c=12;
	String addition = "2,3";
	String substaction = "5,8";
    String multiplication = "9,3";
    String dividion = "5,9";
	
	public void additonOperation()
	{
		int addition = a+b;
		
	}
	public void substactionOperation()
	{
		int substaction =a-b;
	}
	public void multiplicationOperation()
	{
		int multi=a*b;
	}
	 public void divisionOperation()
	 {
		 int div=a/b;
	 }
	
	public void display()
	{
		
		System.out.println("Addition operation"+addition);		
		System.out.println("Substaction operation "+substaction );	   
		System.out.println("Multification operation "+multiplication);	   
		System.out.println("Division operation "+dividion );
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arithmetic arithmetic=new Arithmetic();
		arithmetic.additonOperation();
		arithmetic.substactionOperation();
		arithmetic.multiplicationOperation();
		arithmetic.divisionOperation();
		
		Arithmetic arithmetic1=new Arithmetic();
		arithmetic1.additonOperation();
		arithmetic1.substactionOperation();
		arithmetic1.multiplicationOperation();
		arithmetic1.divisionOperation();
		
		
		
		
	}

}
