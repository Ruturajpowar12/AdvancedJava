<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Input</title>
<style>
body{
background-color:powderblue;
height:100vh;
}
.box{
margin:70px 0px 0px 70px;
background-color:white;
width:400px;
padding:10px;
border-radius:8px;
}
input{
margin-bottom:10px;}

</style>
</head>
<body>
	
	<div class="box">
		<h3 align="center">User Input Information</h3>
		<form action="userProfile.jsp">
		<label>Name</label>
		<input type="text" name="username"><br/>
		<label>Email</label>
		<input type="email" name="email"><br/>
		<label>Birth Date</label>
		<input type="date" name="dob"><br>
		
		<label>Interests</label>
		<input type="text" name="interests"> <br>
		
		<input type="submit" value="Submit">
		
		
	</form>
	</div>
	
</body>
</html>