package conditionalstatement;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int NoOfCalls,BillAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of calls :");
		NoOfCalls =sc.nextInt();
		
		if(NoOfCalls<200) {
			BillAmount=1*NoOfCalls;
			
		}else {
			BillAmount=3*NoOfCalls;
		}
		System.out.println("Total BillAmount :"+BillAmount);
	}

}
