<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head><title>Loan Calculator - Home</title></head>
<body>
    <jsp:include page="Header.jsp" />

    <h2>Select Loan Type</h2>
    <form action="Controller.jsp" method="get">
        <p>
            <label>Select Interest Type:</label><br/>
            <input type="radio" name="type" value="simple" required> Simple Interest<br/>
            <input type="radio" name="type" value="compound" required> Compound Interest
        </p>
        <p>
            <label>Principal Amount ($):</label><br/>
            <input type="number" step="any" name="principal" required/>
        </p>
        <p>
            <label>Time Period (Years):</label><br/>
            <input type="number" step="any" name="years" required/>
        </p>
        <p>
            <label>Annual Interest Rate (%):</label><br/>
            <input type="number" step="any" name="rate" required/>
        </p>
        <input type="submit" value="Calculate Loan"/>
    </form>

    <jsp:include page="Footer.jsp" />
</body>
</html>