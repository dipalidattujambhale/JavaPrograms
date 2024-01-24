package exceptionhandling;

public class SourceEx {

	public static int getSecondSmallest(int[] arr) {
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		return arr[1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 23, 45, 32, 22, 20, 96 };
		System.out.println("second smallest :" + getSecondSmallest(arr));
	}

}
