<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>user greeting calendar</title>
</head>
<body>

<%
   Calendar c = Calendar.getInstance();
 int hour = c.get(Calendar.HOUR_OF_DAY);
 
 String user = request.getParameter("userNm");
 
 
 if(hour>0 && hour<12){
	 out.println("Good Morning "+user);
 }else if(hour>12 && hour<15){
	 out.println("Good Afternoon "+user);
 }else{
	 out.println("Good Evening "+user);
 }
%>

</body>
</html>