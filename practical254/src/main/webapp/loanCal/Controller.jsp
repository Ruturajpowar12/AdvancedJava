<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Icontroller</title>
</head>
<body>
<%
    String type = request.getParameter("type");
    if ("simple".equalsIgnoreCase(type)) {
%>
        <jsp:forward page="Simple.jsp" />
<%
    } else if ("compound".equalsIgnoreCase(type)) {
%>
        <jsp:forward page="Compound.jsp" />
<%
    } else {
%>
        <jsp:forward page="Error.jsp">
            <jsp:param name="message" value="Invalid Loan Type Selected!" />
        </jsp:forward>
<%
    }
%>

</body>
</html>