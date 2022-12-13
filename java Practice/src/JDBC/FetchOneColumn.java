package JDBC;
import java.sql.*;


public class FetchOneColumn {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pass="root";
		
		String query="select firstName from student where id=105";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		while(rs.next()) {
		
		String name=rs.getString("firstName");
		
		System.out.println(name);
		}
		
		
		
	}

}
