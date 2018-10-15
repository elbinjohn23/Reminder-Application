package model;

import java.util.Date;

public class Reminder {

	int reminderID;
	String reminderName;
	Date reminderDate;
	
	public int getReminderId() {
		return reminderID;
	}

	public void setReminderId(int reminderID) {
		this.reminderID = reminderID;
	}

	
	
	public String getReminderName() {
		return reminderName;
	}
	
	public void setReminderName(String reminderName) {
		this.reminderName = reminderName;
	}
	
	public Date getReminderDate() {
		return reminderDate;
	}
	
	public void setReminderDate(Date reminderDate) {
		this.reminderDate = reminderDate;
	}
	
}
