package jdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchDemo {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "root");
	PreparedStatement ps = con.prepareStatement("select * from register");
	ResultSet rs = ps.executeQuery();
	
	while(rs.next()) {
		String name1=rs.getString("name");
		String email1=rs.getString("email");
		String pass1=rs.getString("password");
		String gen=rs.getString("gender");
		System.out.println("Name: "+ name1);
		System.out.println("Email: "+ email1);
		System.out.println("Password:"+ pass1);
		System.out.println("Gender: " +gen);
		System.out.println("------------------------------------");
	}
	
}
}
