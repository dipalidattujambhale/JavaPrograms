package exceptionhandling;

public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = 25 / 0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println(e);
			System.err.println(e);
			e.addSuppressed(e);
		}
		System.out.println("rest of code....");
	}

}
