package conditionalstatement;

import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float salary ,taxAmount;
		
		Scanner sc =new Scanner(System.in); 
		System.out.println("Enter Salary : ");
		salary =sc.nextFloat();
		
		if(salary<25000) {
			taxAmount=salary-0.1f;
		}else {
			taxAmount=salary-0.5f;
		}
		System.out.println("Tax :"+taxAmount);
		
		
	}

}
