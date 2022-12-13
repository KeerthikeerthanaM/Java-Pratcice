import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public  class studentClass {
		 Connection connection;
		 PreparedStatement pd;
	

	public  void createStudentDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			Statement s = connection.createStatement();

			String sql = "CREATE TABLE student" + "(id INTEGER not NULL, " + " firstName VARCHAR(50), "
					+ " lastName VARCHAR(50), " + " age INTEGER, " + "PRIMARY KEY ( id ))";
			s.executeUpdate(sql);
			System.out.println("Created table in given database...");

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public  void insertstudentDetails(int id, String firstName, String lastName, int age) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			String sql = "INSERT INTO student(ID,firstName,lastName,Age)" + "VALUES(?,?,?,?)";
			PreparedStatement pd = connection.prepareStatement(sql);
			pd.setInt(1, id);
			pd.setString(2, firstName);
			pd.setString(3, lastName);
			pd.setInt(4, age);

			int executeInsert = pd.executeUpdate();
			if (executeInsert > 0) {
				System.out.println("Data inserted Successfully................!");
			} else {
				System.out.println("Unable to insert");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public  void updateStudentDetails(int id, int age) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			String sql1 = "UPDATE student SET age=? WHERE id=?";
			PreparedStatement pd = connection.prepareStatement(sql1);
			pd.setInt(1, age);
			pd.setInt(2, id);
			int executeUpdate = pd.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println("Data updated successfully...........!");
			} else {
				System.out.println("Unable to update");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void deleteStudentDetails(int id) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			String sql2 = "DELETE FROM student  WHERE id=?";
			PreparedStatement pd = connection.prepareStatement(sql2);
			pd.setInt(1, id);

			int executeUpdate = pd.executeUpdate();
			if (executeUpdate > 0) {
				System.out.println("Data deleted successfully...........!");
			} else {
				System.out.println("Unable to delete");
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public  void studentDetails() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			PreparedStatement pd = connection.prepareStatement("SELECT * FROM student");
			ResultSet rs = pd.executeQuery();
			while (rs.next()) {
				System.out.println("Student ID: " + rs.getInt("id") + "\nName: " + rs.getString("firstName")
						+ rs.getString("lastName") + "\nAge: " + rs.getInt("age"));
				System.out.println("-----------------------------------------------");
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
