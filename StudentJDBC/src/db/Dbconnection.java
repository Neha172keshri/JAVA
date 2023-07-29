package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection {
	static Connection con;
	public static Connection createconnection() {
		try {
			String url="jdbc:mysql://localhost:3306/bird";
			String username="root";
			String password="mysql";
			 con=DriverManager.getConnection(url,username,password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
return con;}
}
