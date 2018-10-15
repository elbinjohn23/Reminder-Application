package databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	
	
	public static Connection getConnection () {
		
		
		Connection connection ;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/reminder?useSSL=false";
			String uname = "root";
			String password= "root";
			connection = DriverManager.getConnection(url,uname,password);
			return connection;
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return null;
		
	}

}
