package isarelationship;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person=new Person();
		person.display();
		
		
		
		Person person1=new Person(101,"Ravi", new Mydate(02,12,2003));
		
		person1.display();
		
	}

}
