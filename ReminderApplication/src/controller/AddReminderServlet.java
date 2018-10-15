package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import databaseConnection.AddReminders;
import model.Reminder;

/**
 * Servlet implementation class AddReminderServlet
 */
@WebServlet("/addreminder")
public class AddReminderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddReminderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {
			
			
			DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			Reminder reminder = new Reminder();
			reminder.setReminderName(request.getParameter("reminderName"));
			reminder.setReminderDate(sdf.parse(request.getParameter("date")));
			AddReminders addReminders = new AddReminders();
			addReminders.addReminder(reminder);
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.include(request, response);
			out.println("<h6 align='center'>Sucessfull!!!<h6>");

			
			
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
