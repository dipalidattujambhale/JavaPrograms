package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/*public class PreparedStatementDemo() {

    Connection connection;
     
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	
	public PreparedStatementDemo() throws ClassNotFoundException,SQLException
	{
		Connection connection = MyConnection.getMyConnection();
		System.out.println("connection is established ");
	}
	public void insertRecord(int id,String name,String email,int age,String city)throws SQLException {
		
		Connection connection;
		PreparedStatement preparedStatement = connection.prepareStatement("insert into person values(?,?,?,?,?)");
		preparedStatement.setInt(1, id);
		preparedStatement.setString(2, name);
		preparedStatement.setString(3, email);
		preparedStatement.setInt(4, age);
		preparedStatement.setString(5, city);

		int n =preparedStatement.executeUpdate();
		System.out.println(n+"record is inserted ");
	}
	
	public void serchByCity(String city) throws SQLException
	{
		preparedStatement=connection.preparedStatement("select * from person where city =?");
		preparedStatement.setString(1,city);
		
		resultSet = preparedStatement.excuteQuery();
		while(resultSet.next()) {
			System.out.print(resultSet.getInt(1)+"\t");
			System.out.print(resultSet.getString(2)+"\t");
			System.out.print(resultSet.getString(3)+"\t");
			System.out.print(resultSet.getInt(4)+"\t");
			System.out.print(resultSet.getString(5)+"\t");
			System.out.println();
			
			
		}
	}
	public void upadateRecord(String city,int id)throws SQLException
	{
		preparedStatement =connection.prepareStatement("update person set city =? where pid=?");
		preparedStatement.setString(1,city);
		preparedStatement.setInt(2,id);
		
		int n =preparedStatement.executeUpdate();
		System.out.println(n+" record is update");
	}
	
	public void deleteRecord(String city ,int id)throws SQLExcetion  {
	
		preparedStatement =connection.prepareStatement("delete person set city=? where pid=? ");
		preparedStatement.setString(1,city);
		preparedStatement.setInt
		
		int n=preparedStatement.executeUpdate();
		System.out.println(n+"record is delete");
	}
	
	
	
	
	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub

		PreparedStatementDemo demo =new PreparedStatementDemo();
		Scanner sc=new Scanner(System.in);
		int age,id,String,name,email,city;
		
		System.out.println("Enter your choice.\n 1.insert new record \n 2.upadate record \n 3.search by city \n 4. delete record ");
int choice=sc.nextInt();
System.out.println(".................................");

switch(choice) {
case 1:demo.insertRecord(106,"Dipali","dipali@gmail.com",20,"yeola");
	break;
case 2: demo.upadateRecord("nashik", 106);
    break;
    
case 3 : System.out.println("Enter city");

        city=sc.next();
        System.out.println("search By city :"+city);
        demo.serchByCity("city");    
        break ;
case 4: System.out.println("add delete record code");        
     break;
  default:System.out.println("Invalid choice");      
}	
	}
}
*/
