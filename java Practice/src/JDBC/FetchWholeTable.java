package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchWholeTable {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pass="root";
		
		String query="select * from student";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
		
		String studentData=rs.getInt("id")+"  "+rs.getString(2)+"   "+rs.getString(3)+"   "+rs.getInt("age");
		
		System.out.println(studentData);
		}

	}

}
