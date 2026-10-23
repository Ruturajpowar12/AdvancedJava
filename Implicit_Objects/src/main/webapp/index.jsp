<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSP Implicit Objects</title>
</head>
<body>

<h2>JSP Implicit Objects Demonstration</h2>
<p>Name: Ruturaj, Roll No :37</p>

<%
    // 1. pageContext: Set and retrieve an attribute
    pageContext.setAttribute("msg",
        "Hello JSP!");

    // 2. application: Global page-hit counter
    Integer count = (Integer)application.getAttribute("counter");

    if (count == null) {
        count = 0;
    }

    count++;
    application.setAttribute("counter", count);

    // Active users counter using sessions
    Integer activeUsers =
        (Integer)application.getAttribute("activeUsers");

    if (activeUsers == null) {
        activeUsers = 0;
    }

    if (session.isNew()) {
        synchronized (application) {
            activeUsers =
                (Integer)application.getAttribute("activeUsers");

            if (activeUsers == null) {
                activeUsers = 0;
            }

            activeUsers++;
            application.setAttribute("activeUsers", activeUsers);
        }
    }

    // 3. session: Store and retrieve user-specific data
    session.setAttribute("username", "Ruturaj");
    String username =
        (String)session.getAttribute("username");

    // 5. config: Retrieve initialization parameter
    String college = config.getInitParameter("collegeName");

    // 6. request: Retrieve client's IP address
    String ipAddress = request.getRemoteAddr();
%>

<h3>1. pageContext Object</h3>
<p>Message: <%= pageContext.getAttribute("msg") %></p>

<h3>2. application Object</h3>
<p>Total page visits: <%= application.getAttribute("counter") %></p>
<p>Active users (session-based estimate): <%= application.getAttribute("activeUsers") %></p>

<h3>3. session Object</h3>
<p>Username: <%= username %></p>

<h3>4. page Object</h3>
<p>Current JSP page class: <%= page.getClass().getName() %></p>
<p>Included JSP file:</p>
<%
    request.setAttribute("msg", pageContext.getAttribute("msg"));
%>

<jsp:include page="/included.jsp" />

<h3>5. config Object</h3>
<p>College Name: <%= college %></p>

<h3>6. request Object</h3>
<p>Client IP Address: <%= ipAddress %></p>

</body>
</html>