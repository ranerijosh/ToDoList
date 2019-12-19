<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.css" />
<script src="http://code.jquery.com/jquery-2.0.1.min.js"></script>
<script
	src="http://code.jquery.com/mobile/1.4.5/jquery.mobile-1.4.5.min.js"></script>
<meta charset="ISO-8859-1">
<title>To-Do List</title>
</head>
<body>
	<h1>To-Do List</h1>
	<p>What would you like to do?</p>
	<input type="submit" name="btnAdd" value="Add an item" onclick="window.location='/ToDoList2/add.jsp'">
	<input type="submit" name="btnDel" value="Delete an item" onclick="window.location='/ToDoList2/delete.jsp'">
	<input type="submit" name="btnShow" value="Show full list" onclick="window.location='/ToDoList2/show.jsp'">
</body>
</html>