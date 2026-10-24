<%@ page language="java" contentType="text/html; charset=UTF-8" isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head><title>Error Occurred</title></head>
<body style="color: red;">
    <h2>An Error Occurred During Processing!</h2>
    <p><b>Details:</b> <%= exception != null ? exception.getMessage() : request.getParameter("message") %></p>
    <br/>
    <a href="Index.jsp">Go back to Form</a>
</body>
</html>