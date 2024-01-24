package designpattarns;

import java.util.Scanner;

interface MobileShop{
	void mobileNo();
	void price();
}

class IPhone implements MobileShop{

	@Override
	public void mobileNo() {
		System.out.println("Iphone6");
	}

	@Override
	public void price() {
		System.out.println("Rs.70000");
		
	}
	
}
class Samsung implements MobileShop{

	@Override
	public void mobileNo() {
		System.out.println("Samsung Galaxy");
	}

	@Override
	public void price() {
		System.out.println("Rs.4000");
		
	}
	
}
class Blackberry implements MobileShop{

	@Override
	public void mobileNo() {
		System.out.println("Blackberry z10");
	}

	@Override
	public void price() {
		System.out.println("Rs.9000");
		
	}
	
}

class Shopkeeper{
	//create a refrence in above class
	private IPhone iphone;
	private Samsung samsung;
	private Blackberry blackberry;
	
	public Shopkeeper() {
		//
		 iphone =new IPhone();
		 samsung =new Samsung();
		 blackberry =new Blackberry();
		 
		
	}
	
	public void saleIPhone() {
		iphone.mobileNo();
		iphone.price();
	}
	
	public void saleSamsung() {
		samsung.mobileNo();
		samsung.price();
	}
	public void saleBlackberry() {
		blackberry.mobileNo();
		blackberry.price();
	}
	
	
}
public class FacedeDesignPattarnEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create switch cases
		int choice;
		
		Shopkeeper shopkeeper =new Shopkeeper();
		Scanner sc =new Scanner(System.in);
		
		do {
			System.out.println("Enter your choice.press\n 1.IPhone\n 2.Samsung\n 3.Blackberry\n 4.Exit");
			choice =sc.nextInt();
			
			switch(choice) {
			case 1:shopkeeper.saleIPhone();
			break;
			case 2:shopkeeper.saleSamsung();
			break;
			case 3:shopkeeper.saleBlackberry();
			break;
			default:System.out.println("Invalid choice");
			}
		}while(choice !=4);
		
	}

}
