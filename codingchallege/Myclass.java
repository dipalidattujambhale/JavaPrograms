package codingchallege;
/*Q.
Your task here is to implement a Java code based on the following specifications. 
Note that your code should match the specifications in a precise manner.
Consider default visibility of classes, data fields and methods unless mentioned otherwise.
Specifications:
class definitions:class Source:
visibility: public
method definition:
validate(String username, String password): method to authenticate username and password(Use custom values for username and password for authentication)
return type: boolean

Task
Create a Source class and implement below given method:
• validate(String username, String password): Use lambda expression to authenticate
username and password(Use custom values "ABC" for username and "DEF" as password for
authentication). Return true if authentication is successful else return false.
Implement using Lambda expressions.

Sample Input:
Alexa coded123

Sample Output:
false
*/
// ..............by using Stream Apl.............
import java.util.stream.IntStream;

public class Myclass {

	public boolean validate(String username,String password) {
		return IntStream.range(0, 1).mapToObj(i->authenticateUser(username,"ABC")&&authenticatePassword(password,"DEF")).findFirst().orElse(false);
	}
	private boolean authenticateUser(String inputUsername , String validUsername) {
		return inputUsername.equals(validUsername);
	}
	
	private boolean authenticatePassword(String inputPassword , String validPassword) {
		return inputPassword.equals(validPassword);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Myclass sourceExx =new Myclass();
		String username="Alexa";
		String password="Coded123";
		boolean result=sourceExx.validate(username,password);
		System.out.println(result);
	}

}
