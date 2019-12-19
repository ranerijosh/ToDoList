<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show list</title>
</head>
<body>
<h1>To-Do List</h1>
<form action="ShowList" method="post" name="popForm">
	<input type="submit" value="Populate">
</form>
	<table>
		<c:forEach var="item" items="${dispList}">
	  		<tr>
	  			<td>${item.itemNumber}</td>
	  			<td>${item.itemDesc}.</td>
	  		</tr>
		</c:forEach>
	</table>
<input type="submit" name="btnAdd" value="Back to menu" onclick="window.location='/ToDoList2/index.jsp'">
</body>
</html>