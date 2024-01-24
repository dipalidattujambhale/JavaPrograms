package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList list =new ArrayList(); //non-generic list 
		list.add("Raj");
		list.add(100);
		list.add(60.78);
		list.add(true);
		list.add("Raj");
		list.add(null);
		System.out.println("List element :"+list);
		
		ArrayList<String> list2 =new ArrayList(); //generic list 
		list2.add("Rose");
		list2.add("Lilly");
		list2.add("Lotus");
		list2.add("Rose");
		list2.add("Mogra");
		//list2.add(null);
		System.out.println("Generic List  :"+list2);
		
		System.out.println("Iterating list using Iterator Interface  :");
		Iterator<String> iterator=list2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("iterating list using for each loop : ");
		for(String string:list2) {
			System.out.println(string);
		}
		//Collaction -interfase 
		System.out.println("After sorting :");
       Collections.sort(list2);
       for(String string :list2) {
    	   System.out.println(string);
       }
	}
	}
