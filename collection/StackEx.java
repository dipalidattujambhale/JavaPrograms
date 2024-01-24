package collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String>stack =new Stack<>();
		stack.push("Dipali");
		stack.push("Akshada");
		stack.push("priye");
		stack.push("Nikita");
		stack.push("Priyanka");
		stack.push(null);
		
		System.out.println("Stack :"+stack);
		System.out.println("removing element :"+stack.pop());
		System.out.println("Stack after removing :"+stack);
		System.out.println("search Mango :"+stack.search("Nikita"));
		System.out.println("search watermelon :"+stack.search("watermelon"));
		
	}

}
