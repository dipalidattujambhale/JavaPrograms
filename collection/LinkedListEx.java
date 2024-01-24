package collection;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String>linkedList=new LinkedList<>();
		linkedList.addFirst("Apple");
		linkedList.addFirst("Grapes");
		linkedList.addFirst("Mango");
		linkedList.addFirst("Banana");
		linkedList.addFirst("Apple");
		linkedList.addFirst(null);
		
		for(String string : linkedList) {
			System.out.println(string);
		}
		
		LinkedList<String>linkedList2=new LinkedList<>();
		linkedList2.add("Jasmine");
		linkedList2.add("lilly");
		
		linkedList2.addAll(linkedList2);
		System.out.println("adding list2 in list1: \n "+linkedList);
	}

}
