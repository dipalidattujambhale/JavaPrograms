package collection;

import java.util.ArrayDeque;
import java.util.Deque;

// created by Dipali Jambhale 
public class ArrayDequeueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Deque<String>deque =new ArrayDeque<>();
		 deque.add("Apple");
		 deque.add("Mango");
		 deque.add("Banana");
		 deque.add("Guava");
		 deque.add("Papaya");
		// deque.add(null);
		 
		System.out.println("\n Deque :"+deque); 
		 System.out.println("Head of Deque :"+deque.element());
		 System.out.println("Deque :"+deque);
		 System.out.println("Removing first element of Deque :"+deque.pollFirst());
		 System.out.println("Deque :"+deque);
		 System.out.println("Head of Deque :"+deque.peek());
		 System.out.println("Deque :"+deque);	 
	}

}
