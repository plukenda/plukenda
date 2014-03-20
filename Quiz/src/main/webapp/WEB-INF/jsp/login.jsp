<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html; charset=UTF-8"%>

<html>
<h1>Dobro došli</h1>
<c:if test="${!empty quizList}">
	<table class="data">
		<tr>
			<td>Popis kvizova</td>
		</tr>
		<c:forEach items="${quizList}" var="quiz">
			<tr>
				<td><a href="pitanje/${quiz.id }.html">${quiz.imeQuiz}</a></td>
			</tr>
		</c:forEach>
	</table>
</c:if>
</html>