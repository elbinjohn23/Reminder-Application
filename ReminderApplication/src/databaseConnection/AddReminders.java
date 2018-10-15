package databaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import databaseConnection.DBManager;
import model.Reminder;

public class AddReminders {
	
	
	
	public void addReminder(Reminder reminder) {
		
		try {
			
			Connection connection = DBManager.getConnection();
			String string = "insert into reminder (reminderName, reminderDate) values(?,?)";
			Timestamp timestamp = new Timestamp(reminder.getReminderDate().getTime());
			PreparedStatement statement = connection.prepareStatement(string);
			statement.setString(1, reminder.getReminderName());
			statement.setTimestamp(2, timestamp);
			statement.executeUpdate();
			connection.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		
	}

}
