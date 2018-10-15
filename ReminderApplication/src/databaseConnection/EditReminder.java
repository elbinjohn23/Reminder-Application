package databaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

import model.Reminder;


public class EditReminder {

	
	Connection connection;
	String string;
	PreparedStatement statement;
	ResultSet resultSet;
	
	public Reminder selectReminder(int reminderID) {
		// TODO Auto-generated method stub

		try {
			
			
			connection = DBManager.getConnection();
			string = "select * from reminder where reminderID = ?";
			statement = connection.prepareStatement(string);
			statement.setInt(1, reminderID);
			resultSet = statement.executeQuery();
			if (resultSet.next()) {
				
				Reminder reminder = new Reminder();
				reminder.setReminderId(reminderID);
				reminder.setReminderName((resultSet.getString("reminderName")));
				reminder.setReminderDate(resultSet.getDate("reminderDate"));
				connection.close();
				return reminder;
			}
			
			
		}catch (Exception e) {
			// TODO: handle exception
			
			System.out.println(e);
			
		}
		
		return null;
	}
	
	
	public void editReminder(Reminder reminder) {
		
		try {
			connection = DBManager.getConnection();
			Timestamp timestamp = new Timestamp(reminder.getReminderDate().getTime());

			string = "update reminder set reminderName = ?, reminderDate=? where reminderID=?";
			statement = connection.prepareStatement(string);
			statement.setString(1, reminder.getReminderName());
			statement.setTimestamp(2, timestamp);
			statement.setInt(3, reminder.getReminderId());
			statement.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}	
		
	}
	
	
}
