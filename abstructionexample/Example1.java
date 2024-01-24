package abstructionexample;

//Create an abstract class 'parent' with a method' message' .it has two subclasses 
//each having a method with the same name 'message' that prints "This is a firestSubClass" 
//respectively.call the method 'message' by creating an object for each subclass.


abstract class Method
{
	abstract void message();
}
 
 class FirstSubClass extends Method
{
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("This is the First SubClass");
	}	
}
class SecondSubClass extends Method
{
	@Override
	void message() {
		// TODO Auto-generated method stub
		System.out.println("This is a Second SubClass");
	}
}
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FirstSubClass ex=new FirstSubClass();
		ex.message();
		
		SecondSubClass ex1=new SecondSubClass();
		ex1.message();
		
	}

}