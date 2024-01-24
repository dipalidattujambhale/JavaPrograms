package classandobject;

public class Student {

	
	//variable declaration 
	int rollNumber;//long ,short
	String name;
	float phy,chem,maths,total ,percentage ;//double
	
	//instance variable
	//local variable
	//static variable
	
	//Default Constructor
	public Student()
	{
		rollNumber=100;
		name="Adivit";
	    phy= 78;
	    chem=54;
		maths=68;	
		
	}
	
	//parametrized constructor
	
	
	public Student(int rnumber,String name,float phy,float chem,float maths)
	{
		//instance and local variable are inititize 
		rollNumber=rnumber;
		this.name=name;
		this.phy=phy;
		this.chem=chem;
		this.maths=maths;
		
	}
	
	public void calculate()
	{
		total=phy+chem+maths;
	    percentage=total/3;
		
	}
	
	public void display()
	{
		System.out.println("Student Roll Number:"+rollNumber);
		System.out.println("Student Name"+name);
		System.out.println("Total:"+total);
		System.out.println("percentage :"+percentage);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //  System.out.println("Hello World");
		//Default Cons of object
		
		Student student=new Student();
		student.calculate();
		student.display();
		
		//Parame cons of Object
		 Student student1=new Student(101,"Adi",23,45,21);
		 student1.calculate();
		student1.display();
		
	}

}
