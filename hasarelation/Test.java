package hasarelation;

import isarelationship.Mydate;
import isarelationship.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person=new Person();
		person.display();
		Person person1=new Person(101,"Ravi", new Mydate(02,12,2003));
		person1.display();

		/*Employee employee=new Employee();
		employee.Calculate();
		employee.display();
		
		
		Employee employee1=new Employee(102,"shobha", new MyDate(02,12,2003),18,1200, 9000);
		employee1.Calculate();
		employee1.display();*/
		 
		/*SalesPerson emp1=new SalesPerson();
		emp1.calculate();
		emp1.display();

		SalesPerson emp2=new SalesPerson(101,"siv",new MyDate(1,1,2021),20,3000,40);
		emp2.display();
		emp2.calculate();*/
		
		Customer customer=new Customer();
		customer.display();
		customer.calculate();
		
		
		Customer customer1=new Customer();
		customer1.display();
		customer1.calculate();	
}
}
