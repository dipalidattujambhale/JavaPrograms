package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StatementDemo {

	Connection connection ;
	Statement statement;
	ResultSet resultSet;
	
	public StatementDemo() throws ClassNotFoundException, SQLException 
	{
		connection = MyConnection.getMyConnection();
	    System.out.println("connection is establish");
	}
	
	public void getAllRecords() throws SQLException
	{
		// create statement
		statement=connection.createStatement();
	    
		//execute Query
		resultSet =statement.executeQuery("select * from person1 ");
		
		//retrieve Result 
		while(resultSet.next()) {
			System.out.print(resultSet.getInt("pid")+"\t");
		    System.out.print(resultSet.getString(2)+"\t");
		    System.out.print(resultSet.getString(3)+"\t");
		    System.out.print(resultSet.getInt(4)+"\t");
		    System.out.print(resultSet.getString(5)+"\t");
		}
	
	// close connection
		connection.close();
	
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
StatementDemo statementDemo=new StatementDemo();
statementDemo.getAllRecords();
	}

}
