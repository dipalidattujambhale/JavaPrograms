package conditionalstatement;

import java.util.Scanner;

public class ConditionalExx {

	public static void main(String[] args) {
	
	float PurchaseAmt ,DiscAmt,Discount;
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in); 
		System.out.println("Enter Purchase Amount : ");
		PurchaseAmt =sc.nextFloat();
		
		if(PurchaseAmt>=10000) {
			Discount = PurchaseAmt*0.1F;
			DiscAmt =PurchaseAmt-Discount;
		}else {
			Discount = PurchaseAmt*0.02F;
			DiscAmt =PurchaseAmt-Discount;
		}
		
		System.out.println("Discount Amount :"+DiscAmt  );
		
		
		
		
		
		
	}

}
