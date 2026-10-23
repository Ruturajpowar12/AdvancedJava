<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%@ page language="java" %>
<h3>Included JSP Page</h3>
<p>
    Message from index.jsp:
    <%= request.getAttribute("msg") %>
</p>

</body>
</html>