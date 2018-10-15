<%@page import="databaseConnection.EditReminder"%>
<%@page import="model.Reminder"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Reminder </title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style type="text/css">
  	.error{
  		color:red;
  		font-size: 20px;
  	}
  </style>
</head>
<body>
<%
Reminder reminder = new Reminder();
reminder.setReminderId(Integer.parseInt(request.getParameter("reminderID")));
EditReminder editReminder = new EditReminder();
reminder = editReminder.selectReminder(reminder.getReminderId());
DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

%>
<h2 align="center">Edit Reminder </h2>
<div class="container">
		  <form action="edit" method="post">
		  <div class="row">
		  <div class="col-lg-6 col-lg-offset-3">
		  
		  	<div class="form-group">
		      <label for="reminderID">ID:</label>
		      <input type="number" class="form-control" id="reminderID" value="<%=reminder.getReminderId() %>" name="reminderID" readonly="readonly">
		    </div>
		  
		    <div class="form-group">
		      <label for="reminderName">Name:</label>
		      <input type="text" class="form-control" id="reminderName"  value="<%=reminder.getReminderName()%>"  name="reminderName">
		    </div>
		    
		    <div class="form-group">
		      <label for="reminderDate">Date:</label>
		      <input type="date" class="form-control" id="reminderDate" value="<%=sdf.format(reminder.getReminderDate())%>" name="reminderDate">		
		      
		    </div>		    
		   
		    <div align="center"><button type="submit" class="btn btn-primary" value="edit">Edit</button></div>
		    </div>
		    </div>
		  </form>

</body>
</html>