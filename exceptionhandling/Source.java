package exceptionhandling;

public class Source {

	public static void checkAge(int age) throws MyException {
		if (age > 15)
			System.out.println("valid age");
		else
			throw new MyException("not valid ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			checkAge(18);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Rest of code...");
	}
}
