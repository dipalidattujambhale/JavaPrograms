package collection;

//Dipali Jambhale
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//multiple sorting sequence :Salary,name
//Comparator : compare(obj1,obj2)

class Employee{
	int id ,salary;
	String name;
	public Employee(int id, int salary, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}
	
}
class SalaryComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		if(e1.salary==e2.salary)
			return 0;
		else if(e1.salary<e2.salary)
			return 1;
		else 
			return -1;
	}
}

class NameComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
	
		return e1.name.compareTo(e2.name);
	}
	
}
public class CompartorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee>list =new ArrayList<>();
		list.add(new Employee(101,23000,"Dipali"));
		list.add(new Employee(102,26000,"Akshu"));
		list.add(new Employee(101,33000,"priye"));
		list.add(new Employee(101,50000,"Meghna"));
		list.add(new Employee(101,60000,"Ankita"));
		
		System.out.println("sorting on the basis of salary :");
		Collections.sort(list,new SalaryComparator());
        for(Employee employee:list) {
        	System.out.println(employee);
        }
		
        System.out.println("\n sorting on the basis of name :");
		Collections.sort(list,new NameComparator());
        for(Employee employee:list) {
        	System.out.println(employee);
        }	
	}
}
