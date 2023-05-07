<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Student Details | CCS Campus</title>
</head>
<body>
<center>
<h1>${query}</h1>
	<h1>Student Details</h1>
	<table border=1>
		<tr>
			<td>Index No : </td>
			<td>${student.sid}</td>
		</tr>
		<tr>
			<td>First Name : </td>
			<td>${student.firstName}</td>
		</tr>
		<tr>
			<td>Last Name : </td>
			<td>${student.lastName}</td>
		</tr>
		<tr>
			<td>Date of Birth : </td>
			<td>${student.dob}</td>
		</tr>
	</table>
	
</center>
</body>
</html>