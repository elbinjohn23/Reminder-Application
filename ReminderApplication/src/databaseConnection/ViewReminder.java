package databaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import java.sql.Timestamp;

import model.Reminder;
import databaseConnection.DBManager;

public class ViewReminder {

	
	ResultSet resultSet;
	String str;
	PreparedStatement statement;
	Connection connection;
	ArrayList<Reminder> reminders= new ArrayList<Reminder>(); 
		
	
	public ArrayList<Reminder> view() {
		// TODO Auto-generated method stub

		try {
			
			connection = DBManager.getConnection();

			str = "delete from reminder where reminderDate < ?";
			Date date = new Date();
			Timestamp timestamp = new Timestamp(date.getTime());
			statement = connection.prepareStatement(str);
			statement.setTimestamp(1, timestamp);
			statement.executeUpdate();
			connection.close();
			
			connection = DBManager.getConnection();

			str = "select * from reminder";
			statement = connection.prepareStatement(str);
			resultSet = statement.executeQuery();
			
			while (resultSet.next()) {

				Reminder reminder = new Reminder();
				reminder.setReminderId(resultSet.getInt("reminderID"));
				reminder.setReminderName(resultSet.getString("reminderName"));
				reminder.setReminderDate(resultSet.getDate("reminderDate"));
				reminders.add(reminder);
				
			}

			connection.close();
			return reminders;

		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
		return null;
		
	}
	
	
}
