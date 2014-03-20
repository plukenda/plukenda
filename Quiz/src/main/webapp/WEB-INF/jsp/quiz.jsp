
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Quiz</title>


</head>
<body>
	${pitanje}
	<br />
	<table>
		<c:forEach items="${listaOdgovora}" var="odgovor">
			<tr>
				<td>${odgovor.odogvor}</td>
			</tr>
		</c:forEach>
	</table>
	<form action="sljedece.html" method="get">
		<input type="submit" value="submit">
	</form>
</body>
</html>