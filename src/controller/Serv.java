package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Facade;

@WebServlet("/serv")
public class Serv extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public Serv() {
		super();
	}

	// used when browser tries to access web site
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("people", Facade.getAll());
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}

	// used when form is send
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name, sex, car, rocket;
		name = request.getParameter("name");
		sex = request.getParameter("sex");
		car = request.getParameter("car");
		rocket = request.getParameter("rocket");
		if (name == "" || sex == null) {
			request.getRequestDispatcher("WEB-INF/Error.jsp").forward(request, response);
			return;
		}
		sex = Facade.turnSexIntoLetter(sex);
		request.setAttribute("sex", sex);
		//'==' compares memory address, 'equals' compare content
		if (car == null)
			car = "no";
		request.setAttribute("car", car);
		if (rocket == null)
			rocket = "no";
		request.setAttribute("rocket", rocket);
		
		Facade.addPerson(name, sex, car, rocket);
		request.setAttribute("people", Facade.getAll());
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}
}