package series;

// write a programe to display even number between 1 to 100
public class EvenNo1to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=100;  
		System.out.print("List of even numbers from 1 to "+number+": ");  
		for (int i=1; i<=number; i++)   
		{  
		//logic to check if the number is even or not  
		//if i%2 is equal to zero, the number is even  
		if (i%2==0)   
		{  
		System.out.print(i + " ");  
		}  
		}  
	}

}
