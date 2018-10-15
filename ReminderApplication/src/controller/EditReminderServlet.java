package controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import databaseConnection.EditReminder;
import model.Reminder;

/**
 * Servlet implementation class EditReminder
 */
@WebServlet("/edit")
public class EditReminderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditReminderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			
			EditReminder editReminder = new EditReminder();
			DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Reminder reminder = new Reminder();
			reminder.setReminderId(Integer.parseInt(request.getParameter("reminderID")));
			reminder.setReminderName(request.getParameter("reminderName"));
			reminder.setReminderDate(sdf.parse(request.getParameter("reminderDate")));
			editReminder.editReminder(reminder);
			response.sendRedirect("view.jsp");

			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
