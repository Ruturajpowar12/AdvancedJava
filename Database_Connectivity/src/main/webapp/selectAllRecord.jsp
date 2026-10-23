
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Select All Records</title>
</head>
<body>

<h2>Student Records</h2>

<%
    String url = "jdbc:mysql://localhost:3306/studinfo";
    String username = "root";
    String password = "";

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection con = DriverManager.getConnection(
            url, username, password);

        Statement stmt = con.createStatement();

        String sql = "SELECT * FROM student";
        ResultSet rs = stmt.executeQuery(sql);
%>

<table border="1" cellpadding="8">
    <tr>
        <th>Roll No</th>
        <th>Student Name</th>
    </tr>

    <% while (rs.next()) { %>
    <tr>
        <td><%= rs.getString("rollno") %></td>
        <td><%= rs.getString("studnm") %></td>
    </tr>
    <% } %>
</table>

<%
        rs.close();
        stmt.close();
        con.close();

    } catch (Exception e) {
        out.println("Error: " + e.getMessage());
    }
%>

</body>
</html>
