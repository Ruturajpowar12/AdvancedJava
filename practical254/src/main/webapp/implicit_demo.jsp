
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP Implicit Objects Demo</title>
</head>
<body>

    <h2>JSP Implicit Objects Examples</h2>

    <!-- 1. pageContext Object -->
    <h3>1. pageContext Object</h3>

	<%
    pageContext.setAttribute("msg","Hello from PageContext Scope!",PageContext.REQUEST_SCOPE);
	%>

    <jsp:include page="included_page.jsp" />

    <!-- 2. application Object -->
    <h3>2. application Object</h3>

    <%
        Integer visits = (Integer) application.getAttribute("visitCount");

        if (visits == null) {
            visits = 0;
        }

        visits++;
        application.setAttribute("visitCount", visits);
    %>

    <p>Application Visit Count:
        <b><%= visits %></b>
    </p>

    <!-- 3. session Object -->
    <h3>3. session Object</h3>

    <%
        String user = (String) session.getAttribute("username");

        if (user == null) {
            user = "Student_User_1";
            session.setAttribute("username", user);
        }
    %>

    <p>Username stored in session:
        <b><%= user %></b>
    </p>

    <!-- 4. page Object -->
    <h3>4. page Object</h3>

    <p>Current JSP class:
        <b><%= page.getClass().getName() %></b>
    </p>

    <!-- 5. config Object -->
    <h3>5. config Object</h3>

    <p>Username from web.xml:
        <b><%= config.getInitParameter("username") %></b>
    </p>

    <!-- 6. request Object -->
    <h3>6. request Object</h3>

    <p>Client IP Address:
        <b><%= request.getRemoteAddr() %></b>
    </p>

</body>
</html>
