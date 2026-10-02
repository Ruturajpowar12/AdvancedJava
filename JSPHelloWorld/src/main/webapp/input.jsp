<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Input Page</title>
</head>

<body>

<form action="prime.jsp">
    <label for="p1">Enter the Number:</label>
    <input type="text" name="number" id="p1">
    <br>
    <input type="submit" value="Check Prime Number">
</form>

<br>

<form action="Arithmateic.jsp">
    <label for="p2">Enter Number 1:</label>
    <input type="text" name="val1" id="p2">
    <br>

    <label for="p3">Enter Number 2:</label>
    <input type="text" name="val2" id="p3">
    <br>

    <input type="submit" value="Perform Operations">
</form>
<br/>

<form action="checkprime.jsp">
    <label for="p1">Enter the Number:</label>
    <input type="text" name="number" id="p1">
    <br>
    <input type="submit" value="Check Prime Number">
</form>
</body>
</html>