<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add an item</title>
</head>
<body>
<h1>Add an item</h1>
<form action="AddItem" method="post">
	<table>
		<tr><td><input type="text" name="desc" value="" size="100"/></td></tr>
		<tr><td><input type="submit" value="Submit" name="addSub" /></td></tr>
	</table>
</form>
<input type="submit" name="btnAdd" value="Back to menu" onclick="window.location='/ToDoList2/index.jsp'">
</body>
</html>