package exceptionhandling;

public class MultiCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int a[] = new int[10];
			a[12] = 25 / 0;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		// java 7
		try {
			int a[] = new int[10];
			a[12] = 25 / 0;
		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("rest of code");
	}

}
