
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<%@ page import="jakarta.servlet.http.Cookie" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cookie Visit Counter</title>
</head>
<body>
<%
    final int one_min = 60;
    int pgCount = 1;
    boolean found = false;

    Cookie[] cookies = request.getCookies();

    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if ("pgCount".equals(cookie.getName())) {
                try {
                    pgCount = Integer.parseInt(cookie.getValue()) + 1;
                } catch (NumberFormatException e) {
                    pgCount = 1;
                }
                found = true;
                break;
            }
        }
    }

    Cookie newCookie =
        new Cookie("pgCount", String.valueOf(pgCount));

    newCookie.setMaxAge(one_min); 
    newCookie.setPath(request.getContextPath().isEmpty()? "/" : request.getContextPath());

    response.addCookie(newCookie);
%>

<h2>Cookie Visit Counter</h2>
<p>You have visited this page <b><%= pgCount %></b> times.</p>

<a href="visitCount.jsp">Hit Again!</a>
</body>
</html>
