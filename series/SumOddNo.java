package series;

import java.util.Scanner;

// programe to display sum of odd number between 1 to 500
public class SumOddNo {

	public static void main(String[] args) {
				int number, i, oddSum = 100;
				 Scanner sc = new Scanner(System.in);
				
				System.out.print(" Please Enter any Number : ");
				number = sc.nextInt();	
				
				for(i = 1; i <= number; i++)
				{
					if(i % 2 != 0)
					{
						oddSum = oddSum + i; 
					}
				}
				System.out.println("\n The Sum of Odd Numbers upto " + number + "  =  " + oddSum);
	}

}
