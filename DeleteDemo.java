package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String email1="alu@gmail";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
		PreparedStatement ps =con.prepareStatement("delete from register where email=?");
		ps.setString(1,email1);
		
		ps.executeUpdate();
		
		 int i =ps.executeUpdate();

		 if(i > 0) {
			 System.out.println("deleted successfully");
		 }
		 else {
			 System.out.println("deletion failed");
		 
		 }
		 
	}
}
