package codingchallege;
//second smallest number 
import java.util.Scanner;

public class SecondSmallestNumberEx {
	
	public static int getSecondSmallest(int[] arr) {
		int temp,i,j;
		for(i=0;i<arr.length;i++) {
			for(j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr[1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*SecondSmallestNumberEx c1=new SecondSmallestNumberEx();
		int size;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		int[] array=new int[size];
		for(int i=0; i< array.length;i++) {
			array[i]=sc.nextInt();
		}
		int output =c1.getSecondSmallest(array);
		System.out.println(output);	*/
		int arr[]= {23,45,32,22,20,96};
		System.out.println("second smallest :"+getSecondSmallest(arr));
	}
}
