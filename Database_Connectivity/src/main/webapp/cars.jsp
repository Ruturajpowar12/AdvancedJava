
<%@ page import="java.sql.*" %>
<%
    String url = "jdbc:mysql://localhost:3306/jspdb";
    String dbUser = "root";
    String dbPassword = "";

    String message = "";

    if ("POST".equalsIgnoreCase(request.getMethod())) {
        String name = request.getParameter("name");
        String brand = request.getParameter("brand");
        String priceText = request.getParameter("price");
        String yearText = request.getParameter("year");

        try {
            double price = Double.parseDouble(priceText);
            int year = Integer.parseInt(yearText);

            if (name == null || name.trim().isEmpty()
                || brand == null || brand.trim().isEmpty()
                || price < 0 || year < 1886 || year > 2100) {
                throw new IllegalArgumentException("Invalid car details.");
            }

            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(
                        url, dbUser, dbPassword);
                 PreparedStatement ps = con.prepareStatement(
                    "INSERT INTO cars(name, brand, price, model_year) " +
                    "VALUES (?, ?, ?, ?)")) {

                ps.setString(1, name.trim());
                ps.setString(2, brand.trim());
                ps.setDouble(3, price);
                ps.setInt(4, year);
                ps.executeUpdate();

                message = "Car information saved successfully!";
            }
        } catch (Exception e) {
            message = "Error: " + e.getMessage();
        }
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Car info</title>
</head>
<body>
    <h2>Enter Car Information</h2>

    <form method="post">
        Car Name:
        <input type="text" name="name" required><br><br>

        Brand:
        <input type="text" name="brand" required><br><br>

        Price:
        <input type="number" name="price"
               min="0" step="0.01" required><br><br>

        Model Year:
        <input type="number" name="year"
               min="1886" max="2100" required><br><br>

        <input type="submit" value="Save Car">
    </form>

    <p><%= message %></p>

    <h2>Stored Car Details</h2>

    <table border="1" cellpadding="8">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Brand</th>
            <th>Price</th>
            <th>Year</th>
        </tr>

        <%
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                try (Connection con = DriverManager.getConnection(url, dbUser, dbPassword);
                     Statement st = con.createStatement();
                     ResultSet rs = st.executeQuery("SELECT * FROM cars ORDER BY id DESC")) {

                   while (rs.next()) {
        %>
        <tr>
            <td><%= rs.getInt("id") %></td>
            <td><%= rs.getString("name") %></td>
            <td><%= rs.getString("brand") %></td>
            <td><%= rs.getBigDecimal("price") %></td>
            <td><%= rs.getInt("model_year") %></td>
        </tr>
        <%
                    }
                }
            } catch (Exception e) {
        %>
        <tr>
            <td colspan="5">Database error: <%= e.getMessage() %></td>
        </tr>
        <%
            }
        %>
    </table>
</body>
</html>
