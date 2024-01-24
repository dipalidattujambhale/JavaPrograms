package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String>hashset=new HashSet<>();
		hashset.add("Mango");
		hashset.add("coffee");
		hashset.add("Apple");
		hashset.add("Mango");
		hashset.add(null);
	
	
System.out.println("Implementing Hashset :");
for(String string : hashset) {
	System.out.println(string);
}

LinkedHashSet<String>linkedHashSet =new LinkedHashSet<>();
linkedHashSet.add("Akshu");
linkedHashSet.add("Dipa");
linkedHashSet.add("Priye");
linkedHashSet.add("anku");
linkedHashSet.add(null);

System.out.println("implementing LinkdHashSet : \n"+linkedHashSet);

TreeSet< String>treeSet =new TreeSet<>();
treeSet.add("pizza");
treeSet.add("Burger");
treeSet.add("coffee");
treeSet.add("Burger");

System.out.println("implementing TreeSet : \n"+treeSet);
	}
}
