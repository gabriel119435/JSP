package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.Facade;
import domain.Pessoa;

@WebServlet("/servErro")
public class ServErro extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ServErro() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Pessoa> a = Facade.getRepositorioFalso();
		request.setAttribute("pessoas", a);
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}
}
