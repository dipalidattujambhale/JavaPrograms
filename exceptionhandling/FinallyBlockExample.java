package exceptionhandling;

public class FinallyBlockExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("case 1: where exception does't occur");
		try {
			int a = 25 / 0;
			System.out.println("Div :" + a);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("case 1:Finally block always executes");
		}
		System.out.println("case 1: rest of code..");
		System.out.println("....................");

		System.out.println("\n case 2:where exception occurs and handled");

		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			System.out.println("case 2:finally block always excutes");
		}

		System.out.println("case 2: rest of code..");
		System.out.println("....................");

		System.out.println("case 3:where exception occurs but doesn't  handled");

		try {
			int a = 25 / 0;
			System.out.println("Div :" + a);
		} catch (NullPointerException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		finally {
			System.out.println("case 3: finally block always excutes");
		}
		System.out.println("case 3:rest of code");
		System.out.println("..............");

	}

}
