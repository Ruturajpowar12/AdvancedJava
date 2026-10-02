<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
    Integer count = (Integer) session.getAttribute("count");

    if (count == null) {
        count = 0;
    }

    String action = request.getParameter("action");

    if ("increase".equals(action)) {
        count++;
    } 
    else if ("decrease".equals(action)) {
        count--;
    } 
    else if ("reset".equals(action)) {
        count = 0;
    }

    session.setAttribute("count", count);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter App</title>
</head>
<style>
*{
margin:0;padding:0;}
body{
height:100vh;
background:pink;
display:flex;
justify-content:center;
align-items:center;
flex-direction:column;
gap:10px
}

h1{
font-size:40px;
}
#box{
padding:20px; width:300px;
border-radius:10px; background-color:#fff;
box-shadow:10px 10px 20px rgba(0,0,0,0.2);
display:flex;
justify-content:center;
align-items:center;
flex-direction:column;
gap:20px
}
.btns{
display:flex;
justify-content:space-between;}

</style>

<body>

<h1>Counter App</h1>

<div id="box">

    <h1 id="count"><%= count %></h1>

    <div class="btns">

        <form method="get">

            <button name="action" value="increase">
                Increase
            </button>

            <button name="action" value="reset">
                Reset
            </button>

            <button name="action" value="decrease">
                Decrease
            </button>

        </form>

    </div>

</div>

</body>
</html>