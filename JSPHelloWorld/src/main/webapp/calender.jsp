<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user greeting calendar</title>
</head>
<body>

<form>
	<h3>UserGreeting calendar</h3>
    <label for="u1">Enter user name:</label>
    <input type="text" name="userNm" id="u1">
    <br>
    <input type="submit" value="user greeting">
</form>
<br>

<%
   Calendar c = Calendar.getInstance();
 int hour = c.get(Calendar.HOUR_OF_DAY);
 
 String user = request.getParameter("userNm");
 
 if(user ==""){
	 out.println();
	 return;
 }else{

	 if(hour>0 && hour<12){
		 out.println("Good Morning "+user);
	 }else if(hour>12 && hour<15){
		 out.println("Good Afternoon "+user);
	 }else{
		 out.println("Good Evening "+user);
	 }
 }
%>

</body>
</html>