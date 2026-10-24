<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%
    String uname = request.getParameter("username");
    String pass = request.getParameter("password");

    // Simple validation check
    if (uname != null && !uname.trim().isEmpty()) {
        session.setAttribute("username", uname);
        response.sendRedirect("welcome.jsp");
    } else {
        response.sendRedirect("login.jsp");
    }
%>