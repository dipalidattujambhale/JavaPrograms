package conditionalstatement;

import java.util.Scanner;

public class EvenOddNo {

	public static void checkEvenOdd(int s) {
		if (s % 2 == 0) {
			System.out.println("This is a even number");
		} else {
			System.out.println("This is a odd number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOddNo E1 = new EvenOddNo();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int s = sc.nextInt();
		E1.checkEvenOdd(s);
	}

}
