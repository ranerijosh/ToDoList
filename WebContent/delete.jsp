<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Item</title>
</head>
<body>
<h1>Delete an item</h1>
<p>Enter an item number to delete.</p>
<form action="DelItem" method="post">
	<table>
		<tr><td><input type="text" name="itemNbr" value="" size="10"/></td></tr>
		<tr><td><input type="submit" value="Submit" name="submit" /></td></tr>
	</table>
</form>
<input type="submit" name="btnAdd" value="Back to menu" onclick="window.location='/ToDoList2/index.jsp'">
</body>
</html>