<%@ page language="java" contentType="text/html; charset=UTF-8" errorPage="Error.jsp" %>
<!DOCTYPE html>
<html>
<head><title>Compound Interest Calculation</title></head>
<body>
    <jsp:include page="Header.jsp" />

    <%
        double principal = Double.parseDouble(request.getParameter("principal"));
        double rate = Double.parseDouble(request.getParameter("rate"));
        double years = Double.parseDouble(request.getParameter("years"));

        double totalAmount = principal * Math.pow((1 + (rate / 100)), years);
        double interest = totalAmount - principal;
    %>

    <h3>Compound Interest Result</h3>
    <p><b>Principal:</b> $<%= principal %></p>
    <p><b>Interest Rate:</b> <%= rate %>%</p>
    <p><b>Time Period:</b> <%= years %> years</p>
    <p><b>Compound Interest:</b> $<%= String.format("%.2f", interest) %></p>
    <p><b>Total Payable Amount:</b> $<%= String.format("%.2f", totalAmount) %></p>

    <a href="Index.jsp">Calculate Again</a>

    <jsp:include page="Footer.jsp" />
</body>
</html>