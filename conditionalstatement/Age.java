package conditionalstatement;

import java.util.Scanner;

//Accept age from user and check if he/she is eligible 
 //for license or not 
public class Age {

	public void checkAge(int age) {
		if(age>18)
		{
			System.out.println("He/She is eligible for license");
		}else {
			System.out.println("He /She is not eligible for license");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Age A1 =new Age();
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter the Age :");
       int age =sc.nextInt();
        A1.checkAge(age);
       
	}

}
