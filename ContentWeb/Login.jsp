<!DOCTYPE html>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="domain.Pessoa"%>
<%@page import="domain.Facade"%>
<%@page import="javax.xml.ws.Response"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>FoRmUlArIo OrKuT</title>
</head>
<body>
	<form action="serv" method="post">
		<textarea name="nome" wrap="hard" placeholder="Nome completo" ></textarea>
		<br> <input type="radio" name="sexo" value="homem" >Homem<br>
		<input type="radio" name="sexo" value="mulher" >Mulher<br>
		<input type="radio" name="sexo" value="outro" >Outro<br>
		<input type="checkbox" name="carro" value="sim">Tem carro<br>
		<input type="checkbox" name="foguete" value="sim">Tem foguete<br>
		<table border="1">
			<tr>
				<th>Nome</th>
				<th>Sexo</th>
				<th>Carro</th>
				<th>Foguete</th>
			</tr>

			<c:forEach items="${pessoas}" var="pessoa">

				<tr>
					<td>${pessoa.nome}</td>
					<td>${pessoa.sexo}</td>
					<td>${pessoa.carro}</td>
					<td>${pessoa.foguete}</td>
				</tr>
			</c:forEach>




		</table>
		<br> <input type="submit" value="Envie para a tabela!">
	</form>
</body>
</html>