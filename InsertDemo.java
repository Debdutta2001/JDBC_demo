package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertDemo {
	
 public static void main(String[] args) throws ClassNotFoundException, SQLException {
	 //---user-values---//
	 String name1="debu";
		String email="debu@gmail";
		String pass="1234";
		String gender="female";
		
		//---load and register driver---///
	 Class.forName("com.mysql.cj.jdbc.Driver");
	 
	 //--create connection with DB---//
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
	 
	 //---execute prepare statement and return values---//
	 PreparedStatement ps = con.prepareStatement("insert into register values(?,?,?,?)");
	 ps.setString(1,name1);
	 ps.setString(2,email);
	 ps.setString(3,pass);
	 ps.setString(4,gender);
	 
	 int i =ps.executeUpdate();

	 if(i > 0) {
		 System.out.println("success");
	 }
	 else {
		 System.out.println("fail");
	 }
 }
}
