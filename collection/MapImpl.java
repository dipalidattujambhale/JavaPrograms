package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class MapImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<>();
		map.put("In", "India");
		map.put("Br", "Brazil");
		map.put("Fr", "France");
		map.put("De", "Germany");
		map.put("Ar", "Amerika");

		System.out.println("Implementing Hashmap :");
		for (Map.Entry<String, String> entry : map.entrySet()) {
			System.out.println("Counter code :" + entry.getKey() + ",Countery :" + entry.getValue());
		}
		System.out.println(map.get("Br"));

		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("BR102", "tea");
		treeMap.put("D10A", "sandwitch");
		treeMap.put("L27", "Pizza");
		treeMap.put("S234", "chole -puri");
		//treeMap.put(null, null);

		System.out.println("Implementing TreeMap :");
		for (Map.Entry<String, String> entry : treeMap.entrySet()) {
			System.out.println("Counter code :" + entry.getKey() + ",Countery :" + entry.getValue());
		}
		Hashtable<String, String> hashtable = new Hashtable<>();
		hashtable.put("BR102", "coffee");
		hashtable.put("BR104", "Biryani");
		hashtable.put("L021", "chole -puri");
		hashtable.put("D123", "pizza");
		hashtable.put("D106", "Sandwitch");

		System.out.println("Implementing HashTable :");
		for (Map.Entry<String, String> entry : hashtable.entrySet()) {
			System.out.println("code :" + entry.getKey() + ",Countery :" + entry.getValue());
		}
	}
}
