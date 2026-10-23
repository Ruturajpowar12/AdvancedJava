<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="my" uri="/WEB-INF/uppercase.tld" %>

<!DOCTYPE html>
<html>
<head>
    <title>Custom JSP Tag</title>
</head>
<body>
    <h2>Custom Tag Example</h2>

    <p>Original String: hello java programming</p>

    <p>Uppercase String:
       <my:uppercase value="hello java programming" /></p>
</body>
</html>


