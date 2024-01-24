package java8features;

import java.util.List;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StreamEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String>names =Arrays.asList("Raj","Dipali ","Hemalatha","Darshini","Jagruthi","Akshu");
		
		//create a Stream
		Stream<String>allnames =names.stream();
		
		//perform intermediate operation
		Stream<String> longNames = allnames.filter(str ->str.length()>7);
		
		//perform terminal operation 
		System.out.println("using forEach() :");
		longNames.forEach(str->System.out.println(str));
		
		//single line 
		//collect(collectors.tolist()):used to convert stream into list
		List<String>namesCollect = names.stream().filter(str->str.length()>7).collect(Collectors.toList());
		System.out.println("\n using collect() :");
		
		//namesCollect.forEach(str->System.out.println(str));
		namesCollect.forEach(System.out::println);
	}

}
