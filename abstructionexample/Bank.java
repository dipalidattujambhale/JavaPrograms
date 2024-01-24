package abstructionexample;

import java.util.Scanner;

abstract class BankEx {
	public abstract float getRateOfInterest();

}

class BOI extends BankEx {
	@Override
	public float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 8.5f;
	}
}

class TJSB extends BankEx {
	@Override
	public float getRateOfInterest() {
		// TODO Auto-generated method stub
		return 6.6f;
	}
}

public class Bank {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float principleAmount, years, rateBOI, rateTJSB;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle amount: ");
		principleAmount = sc.nextFloat();
		System.out.println("Enter number of years: ");
		years = sc.nextFloat();

		BankEx bBOI = new BOI();
		rateBOI = bBOI.getRateOfInterest();

		BankEx bTJSB = new TJSB();
		rateTJSB = bTJSB.getRateOfInterest();

		float interestBOI = (principleAmount * years * rateBOI) / 100;

		float interestTJSB = (principleAmount * years * rateTJSB) / 100;

		System.out.println("Simple Interest for BOI :" + interestBOI);
		System.out.println("Simple Interest for TJSB :" + interestTJSB);
	}

}