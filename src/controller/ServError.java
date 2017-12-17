package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Facade;
import domain.Person;

@WebServlet("/servError")
public class ServError extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServError() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Person> all = Facade.getAll();
		request.setAttribute("people", all);
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}
}
