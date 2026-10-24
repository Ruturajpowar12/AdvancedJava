<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Loan Schedule Calculator</title>
    <style>
        table, th, td { border: 1px solid black; border-collapse: collapse; padding: 8px; text-align: center; }
    </style>
</head>
<body>
    <h2>Loan Amortization Calculator</h2>
    <form method="post">
        <p>Principal Loan Amount ($): <input type="number" step="any" name="principal" required /></p>
        <p>Period of Time (in Years): <input type="number" name="years" min="1" max="30" required /></p>
        <input type="submit" value="Calculate Schedule" />
    </form>

    <%
        String pStr = request.getParameter("principal");
        String yStr = request.getParameter("years");

        if (pStr != null && yStr != null) {
            double principal = Double.parseDouble(pStr);
            int years = Integer.parseInt(yStr);

            // Determine interest rate based on rules
            double annualRate = 0.0;
            if (years >= 1 && years <= 7) {
                annualRate = 5.35;
            } else if (years >= 8 && years <= 15) {
                annualRate = 5.5;
            } else if (years >= 16 && years <= 30) {
                annualRate = 5.75;
            }

            double monthlyRate = (annualRate / 100) / 12;
            int totalMonths = years * 12;

            // Monthly Payment Formula: M = P * [r(1+r)^n] / [(1+r)^n - 1]
            double monthlyPayment = (principal * monthlyRate * Math.pow(1 + monthlyRate, totalMonths)) /
                                   (Math.pow(1 + monthlyRate, totalMonths) - 1);
    %>
            <h3>Loan Summary</h3>
            <p><b>Principal:</b> $<%= principal %></p>
            <p><b>Term:</b> <%= years %> Years (<%= totalMonths %> Months)</p>
            <p><b>Applicable Interest Rate:</b> <%= annualRate %>%</p>
            <p><b>Monthly Payment Amount:</b> $<%= String.format("%.2f", monthlyPayment) %></p>

            <h3>Payment Schedule</h3>
            <table>
                <tr>
                    <th>Payment #</th>
                    <th>Interest Paid</th>
                    <th>Principal Paid</th>
                    <th>Remaining Balance</th>
                </tr>
                <%
                    double balance = principal;
                    for (int month = 1; month <= totalMonths; month++) {
                        double interestPaid = balance * monthlyRate;
                        double principalPaid = monthlyPayment - interestPaid;
                        balance -= principalPaid;
                        if (balance < 0) balance = 0;
                %>
                <tr>
                    <td><%= month %></td>
                    <td>$<%= String.format("%.2f", interestPaid) %></td>
                    <td>$<%= String.format("%.2f", principalPaid) %></td>
                    <td>$<%= String.format("%.2f", balance) %></td>
                </tr>
                <% } %>
            </table>
    <%  } %>
</body>
</html>