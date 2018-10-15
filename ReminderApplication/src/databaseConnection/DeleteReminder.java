package databaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

import databaseConnection.DBManager;

public class DeleteReminder {

	
	Connection connection;
	String string;
	PreparedStatement statement;
	
	public void deleteReminder(int reminderID){
		
		try {
			
			connection = DBManager.getConnection();
			string = "delete from reminder where reminderID = ?";
			statement = connection.prepareStatement(string);
			statement.setInt(1, reminderID);
			statement.executeUpdate();
			connection.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}
	
}
