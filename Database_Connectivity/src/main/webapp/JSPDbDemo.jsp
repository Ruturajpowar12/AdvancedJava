
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>JSPDatabase</title>
</head>
<body>

<%
    String rollNo = request.getParameter("rollNo");
    String nm = request.getParameter("Nm");

    out.println("RollNo = " + rollNo + " Nm = " + nm + "<br>");

    // Database connection details
   String dNm = "com.mysql.cj.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost:3306/";
    String dbName = "studinfo";
    String userId = "root";
    String password = "";
	
    
    String url = connectionUrl + dbName;

    try {
        // Load MySQL driver
        Class.forName(dNm);
        out.println("SQL Driver loaded.<br>");

        // Connect to MySQL database
        Connection connection =
            DriverManager.getConnection(url, userId, password);

        out.println("SQL Connection done.<br>");

        // Insert data
        int r = Integer.parseInt(rollNo);

        String sql = "INSERT INTO student VALUES(" + r + ", '" + nm + "')";

        Statement statement = connection.createStatement();
        int noOfRowsAffected = statement.executeUpdate(sql);

        if (noOfRowsAffected > 0) {
            out.println("Value inserted successfully.<br>");
        } else {
            out.println("Value not inserted.<br>");
        }

        statement.close();
        connection.close();

    } catch (Exception e) {
        out.println("Exception: " + e.getMessage());
    }
%>

<a href="selectAllRecord.jsp">Click here to view all records.</a>

</body>
</html>
