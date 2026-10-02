<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Arithmetic Operations</title>
</head>
<body>

<h1>Arithmetic Operations</h1>

<%
String val1 = request.getParameter("val1");
String val2 = request.getParameter("val2");

int num1 = Integer.parseInt(val1);
int num2 = Integer.parseInt(val2);

out.println("Addition : " + (num1 + num2) + "<br>");
out.println("Subtraction : " + (num1 - num2) + "<br>");
out.println("Multiplication : " + (num1 * num2) + "<br>");
out.println("Division : " + (num1 / num2) + "<br>");
%>

</body>
</html>