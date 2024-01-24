package collection;

// created Dipali Jambhale
import java.util.PriorityQueue;
import java.util.Queue;

// created by Dipali Jambhale
public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Queue<String>queue =new PriorityQueue<>();
		queue.add("Mogra");
		queue.offer("Rose");
		queue.offer("lillay");
		queue.offer("lotus");
	//	queue.offer(null);//you can not store null values
		
		System.out.println("Queue :"+queue);
		System.out.println("Head of Queue :"+queue.element());
		System.out.println("Removing Queue element : "+queue.remove());
		System.out.println("After removing Queue :"+queue);
		System.out.println("Removing element :"+queue.poll());
		System.out.println("After removing Queue :"+queue);
		
	}

}
