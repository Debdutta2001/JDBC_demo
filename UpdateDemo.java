package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	String pass="6789";
	String email1="debu@gmail.com";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
	
	PreparedStatement ps =con.prepareStatement("update register set password=? where email=? ");
	ps.setString(1, pass);
	ps.setString(2, email1);
	
	 int i =ps.executeUpdate();

	 if(i > 0) {
		 System.out.println("updated successfully");
	 }
	 else {
		 System.out.println("failed");
	 
	 }
	 con.close();
}

}
