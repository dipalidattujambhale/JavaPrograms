package exceptionhandling;

import java.util.Scanner;

public class DistanceTraveled {

	public void getDistance(int t) {

		int u = 10;
		int a = 5;

		int d = u * t + ((a * t * t) / 2);
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		DistanceTraveled ds = new DistanceTraveled();
		ds.getDistance(a);
		ds.getDistance(b);

	}

}
