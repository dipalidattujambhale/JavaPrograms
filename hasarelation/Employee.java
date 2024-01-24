package hasarelation;

public class Employee extends Person 
{
    float workingDay,perDay,salary;
    
    public Employee()
    {
    	super();//used to call parent class constructor,1st line of Constructor
    	workingDay=25;
    	perDay=2000;
    	
    }
    
    public Employee(int id,String Name, MyDate dob, float workingDay ,float perDay,float salary)
    {
    	super();
    	
    	this.workingDay = workingDay();
    	this.perDay = perDay();
    	
    }

	private float perDay() {
		return 0;
	}

	private float workingDay() {
		return 0;
	}

	public void Calculate()
	{
		salary=workingDay *perDay;
		
	}
    
    @Override//override display() for parson class
    public void display()
    {
    	super.display();
    	System.out.println("salary :"+salary);
    }

	public void calculate() {
		// TODO Auto-generated method stub
		
	}   
}
