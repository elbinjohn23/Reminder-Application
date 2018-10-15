<%@page import="java.text.DateFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="databaseConnection.ViewReminder"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Reminder"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<title>Reminder</title>
<style>
	table {
			border-spacing: 15px;
			border-bottom: 1px scrollbar solid;
			border-collapse: collapse;
		}
	
	th, td {
			border: 1px solid black;
			text-align: center;
			padding: 35px;
		}
	body{
		margin:30px;
		background-color: bisque;
		}

</style>
</head>
<body>
<% 
	ArrayList<Reminder> reminders = new ArrayList<>();
	ViewReminder viewReminder = new ViewReminder();
	reminders = viewReminder.view();
	DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
%>

<h1>

Reminder

</h1>
<table>
	<tr>
		<th>ID</th>
		<th>Name</th>
		<th>Date</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>
<%
	for (Reminder r : reminders) {
%>
		<tr>
			<td><%=r.getReminderId()%></td>
			<td><%=r.getReminderName()%></td>
			<td><%=sdf.format(r.getReminderDate())%></td>
			<td><a href='edit.jsp?reminderID=<%=r.getReminderId()%>'>Edit</a></td>
			<td><a href='delete?reminderID=<%=r.getReminderId()%>'>Delete</a></td>
		</tr>	
	
<% 
	}
%>
</table>


</body>
</html>