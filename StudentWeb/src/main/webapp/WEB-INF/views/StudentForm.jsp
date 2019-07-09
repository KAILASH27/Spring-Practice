<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	<form action="authenticate" method="post">
		<table>
			<tr>
				<td>RollNo</td>
				<td>:</td>
				<td><input type="text" name="rollno" required></td>
			</tr>
			<tr>
				<td>Name</td>
				<td>:</td>
				<td><input type="text" name="name" required></td>
			</tr>
			<tr>
				<td>Marks</td>
				<td>:</td>
				<td><input type="text" name="marks" required></td>
			</tr>
			<tr>
				<td>MobileNo</td>
				<td>:</td>
				<td><input type="text" name="mobileno" required></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit">&nbsp;&nbsp;&nbsp;&nbsp;
					<input type="reset"></td>
			</tr>
		</table>
	</form>

</body>
</html>