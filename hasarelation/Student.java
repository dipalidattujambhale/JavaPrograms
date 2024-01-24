package hasarelation;

public class Student {
  
	int RollNo;
	float Percentage;
	char Grade;
	String SName;
	 
	public Student()
	{
		super();
		RollNo=12;
		Percentage=35;
		Grade='a';
		SName="Akash";
	}
	public Student(int id,String Name, MyDate dob,int RollNo,float Percentage,char Grade,String SName)
	{
		super();
		this.Grade=Grade();
		this.RollNo=RollNo();
		
	}
	private int RollNo() {
		// TODO Auto-generated method stub
		return 0;
	}
	private char Grade() {
		// TODO Auto-generated method stub
		return 0;
	}
}
