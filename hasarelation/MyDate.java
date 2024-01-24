package hasarelation;

public class MyDate {

	//VD
	int dd,mm,yy;
	
	//Default Cons 
	public MyDate()
	{
		dd=21;
		mm=03;
		yy=2000;
		
	}
	
	public MyDate(int dd,int mm,int yy)
	{
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
	}
	
	public void display()
	{
		System.out.println("Date : "+dd+" - "+mm+" - "+yy);
	}
}
