package conditionalstatement;

import java.util.Scanner;

public class GreatestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Number :");
		int s = sc.nextInt();

		System.out.println("Enter Second Number :");
		int t = sc.nextInt();

		System.out.println("Enter Third Number :");
		int r = sc.nextInt();

		if (s >= t && s >= r) {
			System.out.println(s +" is a largest no..");
		} else if (t >= s && t >= r) {
			System.out.println(t +" is a largest no..");
		} else {
			System.out.println(r +" is a largest no..");
		}
	}
}