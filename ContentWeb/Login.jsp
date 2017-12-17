<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Form</title>
</head>
<body>
	<form action="serv" method="post">
		<textarea name="name" placeholder="Complete name"></textarea>
		<br> 
		<input type="radio" name="sex" value="man">Man<br>
		<input type="radio" name="sex" value="woman">Woman<br> <input
			type="radio" name="sex" value="other">Other<br> <input
			type="checkbox" name="car" value="yes">Has car<br> <input
			type="checkbox" name="rocket" value="yes">Has rocket<br>
		
		<table border="1">
			<tr>
				<th>Name</th>
				<th>Sex</th>
				<th>Car</th>
				<th>Rocket</th>
			</tr>
			<c:forEach items="${people}" var="person">
				<tr>
					<td>${person.name}</td>
					<td>${person.sex}</td>
					<td>${person.car}</td>
					<td>${person.rocket}</td>
				</tr>
			</c:forEach>
		</table>
		
		<br> <input type="submit" value="Send">
	</form>
</body>
</html>