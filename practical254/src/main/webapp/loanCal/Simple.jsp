<%@ page language="java" contentType="text/html; charset=UTF-8" errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head><title>Simple Interest Calculation</title></head>
<body>
    <jsp:include page="Header.jsp" />

    <%
        double principal = Double.parseDouble(request.getParameter("principal"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        double years = Double.parseDouble(request.getParameter("years"));

        double interest = (principal * rate * years) / 100;
        double totalAmount = principal + interest;
    %>

    <h3>Simple Interest Result</h3>
    <p><b>Principal:</b> $<%= principal %></p>
    <p><b>Interest Rate:</b> <%= rate %>%</p>
    <p><b>Time Period:</b> <%= years %> years</p>
    <p><b>Interest Amount:</b> $<%= String.format("%.2f", interest) %></p>
    <p><b>Total Payable Amount:</b> $<%= String.format("%.2f", totalAmount) %></p>

    <a href="Index.jsp">Calculate Again</a>

    <jsp:include page="Footer.jsp" />
</body>
</html>