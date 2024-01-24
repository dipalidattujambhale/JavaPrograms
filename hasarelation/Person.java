package hasarelation;

import isarelationship.Mydate;

public class Person {

	int id;
	String Name;
	Mydate dob;
	
	public  Person()
	{
		id=100;
		Name="Ravita";
		dob=new Mydate();
	}
	public Person(int id,String Name,Mydate dob)
	{
		this.id=id;
		this.Name=Name;
		this.dob=dob;
		
	}
	public Person(int id2, String name2, String prodName, MyDate dob2, int quality, float price) {
		// TODO Auto-generated constructor stub
	}
	public void display()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+Name);
		dob.display();		
	}	
}
