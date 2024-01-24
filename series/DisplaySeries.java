package series;

// write a programe to display a series 1/2+1/4+1/6+........+1/20

public class DisplaySeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		double sum=0;
		for(int i=2; i<=n;i++) {
			sum +=1.0/i;
		}
		System.out.println("Display series : 1/2+1/4+1/6........1/20");
	}

}
