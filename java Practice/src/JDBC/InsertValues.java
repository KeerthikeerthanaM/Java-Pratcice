package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertValues {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pass="root";
		
		String query="insert into student values(2,'Alice','Peter',25)";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		int count=st.executeUpdate(query);       //returns int values like 1 row affected...........
		
		

		System.out.println(count+ " rows affected");
	

	}

}
