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
</head>
<body>

<div class="container">
	<h1 align="center">Set Reminder</h1>
</div>
	<h4 align="center"><a href='view.jsp'>View Reminders</a> </h4>
		<form action="addreminder" method="post">
			<div class="row">
				<div class="col-lg-6 col-lg-offset-3">
					<div class="form-group">
						<label for="remindername">Reminder Name:</label> <input type="text"
							class="form-control" id="reminderName" placeholder="Enter Reminder Name"
							name="reminderName">
					</div>
					<div class="form-group">
						<label for="date">Select Date:</label> 
						<input type="text" 	class="form-control" id="date" placeholder="Select Date(DD-MM-YYYY)"
							name="date">
							<script type="jQuery.ui.datepicker.js"></script>
							<script type="jQuery.ui.datepicker.js"></script>
					</div>
					  <div align="center"><button type="submit" class="btn btn-primary" value="addreminder">Set Reminder</button></div>
				</div>
			</div>
		</form>

</body>
</html>