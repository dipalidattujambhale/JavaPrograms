package isarelationship;

public class Mydate {

	//variable declaration
	 int dd,mm,yy;
	 //Default Const
	 public Mydate()
	 {
		 dd=12;
		 mm=07;
		 yy=1998; 
	 }
	//param const
	 public Mydate(int dd,int mm,int yy)
	 {
		 this.dd=dd;
		 this.mm=mm;
		 this.yy=yy;	 
	 }
	public void display()
	{
		System.out.println("Date: "+dd+" -"+mm+" -"+yy);
	}
}
