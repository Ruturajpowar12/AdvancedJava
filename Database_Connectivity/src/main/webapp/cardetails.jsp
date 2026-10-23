<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Car Details Form</title>
</head>
<body>
    <h2>Enter Car Details</h2>

    <form action="printcars.jsp" method="post">
        Car Name:
        <input type="text" name="name" required>
        <br><br>

        Brand:
        <input type="text" name="brand" required>
        <br><br>

        Price:
        <input type="number" name="price"
               step="0.01" required>
        <br><br>

        Model Year:
        <input type="number" name="year" required>
        <br><br>

        <input type="submit" value="Save Car">
    </form>
</body>
</html>
