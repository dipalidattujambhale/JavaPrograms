package isarelationship;

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
	public void display()
	{
		System.out.println("Id:"+id);
		System.out.println("Name:"+Name);
		dob.display();		
	}
		
}
