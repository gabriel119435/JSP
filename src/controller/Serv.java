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

@WebServlet("/serv")
public class Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Serv() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String nome,sexo,carro,foguete;

		nome = request.getParameter("nome");
		sexo = request.getParameter("sexo");
		carro = request.getParameter("carro");
		foguete = request.getParameter("foguete");
		if (nome == "" || sexo == null) {
			response.sendRedirect("Erro.jsp");
			return;
		}
		sexo = Facade.letrar(sexo);
		request.setAttribute("sexo", sexo);
		if (carro == null) { // compara endereço de memoria equals compara
								// conteudo
			carro = "nao";
			request.setAttribute("carro", carro);
		} else
			request.setAttribute("carro", carro);
		if (foguete == null) {
			foguete = "nao";
			request.setAttribute("foguete", foguete);
		} else
			request.setAttribute("foguete", foguete);

		Facade.AdicionaPessoa(nome, sexo, carro, foguete);
		
		List<Pessoa> a = Facade.getRepositorioFalso();
		request.setAttribute("pessoas", a);
		
		request.getRequestDispatcher("Login.jsp").forward(request, response);
	}
}