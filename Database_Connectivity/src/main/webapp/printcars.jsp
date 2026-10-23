
<%@ page import="java.sql.*" %>
<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Saved Car Details</title>
</head>
<body>
    <h2>Car Details</h2>

    <%
        String name = request.getParameter("name");
        String brand = request.getParameter("brand");
        String price = request.getParameter("price");
        String year = request.getParameter("year");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jspdb",
                "root",
                ""
            );

            String sql = "INSERT INTO cars "
                       + "(name, brand, price, model_year) "
                       + "VALUES (?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, brand);
            ps.setBigDecimal(3, new java.math.BigDecimal(price));
            ps.setInt(4, Integer.parseInt(year));

            int result = ps.executeUpdate();

            if (result > 0) {
                out.println("<p>Car saved successfully!</p>");
                out.println("<p>Car Name: " + name + "</p>");
                out.println("<p>Brand: " + brand + "</p>");
                out.println("<p>Price: " + price + "</p>");
                out.println("<p>Model Year: " + year + "</p>");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            out.println("<p>Error: " + e.getMessage() + "</p>");
        }
    %>

    <a href="cardetails.jsp">Add Another Car</a>
</body>
</html>
