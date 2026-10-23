<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cookie Session Program</title>
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
                    pgCount = Integer.parseInt(cookie.getValue());
                    pgCount++;
                } catch (NumberFormatException e) {
                    pgCount = 1;
                }
                cookie.setValue(String.valueOf(pgCount));
                cookie.setMaxAge(one_min);
                response.addCookie(cookie);
                found = true;
                break;
            }
        }
    }

    if (!found) {
        Cookie newCookie = new Cookie("pgCount", String.valueOf(pgCount));
        newCookie.setMaxAge(one_min);
        response.addCookie(newCookie);
    }

    out.println("You have hit this page <b> " + pgCount + "</b> times.");
%>
<br>
<a href="cookiesSession.jsp">Hit Again!</a>
</body>
</html>
