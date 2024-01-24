package collection;

import java.util.Vector;
import java.util.Enumeration;
public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> vector =new Vector<>();
		vector.addElement("Jasmine");
		vector.add("Lilly");
		vector.add("Mango");
		vector.add("Banana");
		vector.add("Lilly");
		vector.add(null);
		
		Enumeration<String>e =vector.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
