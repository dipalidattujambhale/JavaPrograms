package hasarelation;

public class Customer  extends Person {

	String prodName;
	float billAmount ,quality,price,discount,finalbill,salePrice; 
	public Customer() {
		super();
		prodName="Printer";
		quality=12;
		price=1000;
	}
	public Customer(int Id,String name,String prodName,MyDate dob,int quality,float price)
	{
		super(Id,name,prodName,dob,quality,price);
		this.prodName=prodName();
		this.quality=quality();
		this.price=price();
		
		
	}
	 private float price() {
		// TODO Auto-generated method stub
		return 1000;
	}
	private float quality() {
		// TODO Auto-generated method stub
		return 12;
	}
	private String prodName() {
		// TODO Auto-generated method stub
		return "printer";
	}
	public void calculate()
	 {
		 billAmount=price*quality;
		 
	}
	public void discount()
	{
		if(billAmount>=20000)
		{
			discount=0.15f*billAmount;	
		}else if(billAmount>=15000)
		{
			discount=0.10f*billAmount;
		}else if(billAmount>=10000)
		{
			discount=0.7f*billAmount;
		}else if(discount<10000)
		{
			discount=price-salePrice;
		}else if(1000<discount)
		{
			finalbill=salePrice-discount;
		}	
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Discount : "+discount);
		System.out.println("Finalbill : "+finalbill);
	}
}
