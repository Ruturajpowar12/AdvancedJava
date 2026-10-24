<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="math" uri="/WEB-INF/math.tld" %>
<!DOCTYPE html>
<html>
<head><title>Custom Tag Sum Calculator</title></head>
<body>
    <h2>Sum of Two Numbers using Custom Tag</h2>

    <form method="get">
        Number 1: <input type="number" name="n1" required/><br/><br/>
        Number 2: <input type="number" name="n2" required/><br/><br/>
        <input type="submit" value="Calculate Sum"/>
    </form>
    <br/>

    <%
        String n1Str = request.getParameter("n1");
        String n2Str = request.getParameter("n2");

        if (n1Str != null && n2Str != null) {
            int n1 = Integer.parseInt(n1Str);
            int n2 = Integer.parseInt(n2Str);
    %>
            <h3>Result:</h3>
            <math:add num1="<%= n1 %>" num2="<%= n2 %>" />
    <%  } %>
</body>
</html>