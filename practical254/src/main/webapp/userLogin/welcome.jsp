<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    String user = (String) session.getAttribute("username");

    // Protect page from unauthorized access
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head><title>Welcome Page</title></head>
<body>
    <h2>Welcome, <%= user %>!</h2>
    <p>You have successfully logged in using JSP Sessions.</p>

    <a href="logout.jsp">Logout</a>
</body>
</html>