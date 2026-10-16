<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Profile</title>
<style type="text/css">
body{
background-color:powderblue;
height:100vh;
}
.box{
margin:70px 0px 0px 70px;
background-color:white;
width:400px;
padding:10px 0px 10px 20px;
border-radius:8px;
}
button{
margin-left:130px;
}
a{
text-decoration:none;
}

</style>
</head>
<body>
<%
	String name = request.getParameter("username");
	String email = request.getParameter("email");
	String dob = request.getParameter("dob");
	String interest = request.getParameter("interests");
%>

<div class="box">
<h3 align="center">User Profile</h3>
<p><b>User Name :</b> <%=name %></p>
<p><b>Email :</b> <%=email %></p>
<p><b>Date of Birth :</b> <%=dob %></p>
<p><b>Interest :</b> <%=interest %></p>
<button ><a href="UserInput.jsp">Update Profile</a></button>
</div>


</body>
</html>