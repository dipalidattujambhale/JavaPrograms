package codingchallege;
import java.util.Scanner;
import java.util.stream.Collectors;
/*
 * 
 * Coding Challenge:
Your task here is to implement a Java code based on the following specifications. Note that your code should match the specifications in a precise manner. Consider default visibility of classes, data fields and methods unless mentioned otherwise.
Specifications:
class definitions:class Source:
visibility: public
method definition:
insertSpace(String s): method that uses lambda expression to format a given string, where a space is inserted between each character of string.
return type: String
Task
Create a Source class and implement below given method:
• insertSpace(String s): Use lambda expression to format a given string, where a space is inserted between each character of string
Implement using Lambda expressions.
Sample Input:
capgemini

Sample Output:
c a p g e m i n i
*/

@FunctionalInterface
interface Space
{
	String insertSpace(String s);
}

public class Source{
	public String insertSpace(String s) {
		//two option,1)  using collectors
		/*return s.chars().   //converting into character
				mapToObj(ch->(char)ch +" ") //adding space for each char 
				.collect(Collectors.joining());//joining character 
		*/
		// 2) toString method
		return s.chars().mapToObj(ch->(char)ch +" ").collect(StringBuilder::new,StringBuilder::append,StringBuilder::append).toString().trim();
		
		
	}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String input =sc.nextLine();
		
		Source s1 =new Source();
		String result =s1.insertSpace(input);
		System.out.println(result);
		sc.close();
	}
}