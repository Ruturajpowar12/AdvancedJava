<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Database Connectivity</title>
</head>
<body>
    <form method="post" action="JSPDbDemo.jsp">
        <table>
            <tr>
                <td>Roll_no</td>
                <td><input type="text" name="rollNo" size="15" /></td>
            </tr>

            <tr>
                <td>student_name</td>
                <td><input type="text" name="Nm" size="15" /></td>
            </tr>

            <tr>
                <td></td>
                <td><input type="submit" name="insert" value="Save"></td>
            </tr>
        </table>
    </form>

    <a href="selectAllRecord.jsp">Click here to view all records.</a>
</body>
</html>