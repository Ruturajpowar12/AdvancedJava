<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>

<html>
<head>
<meta charset="UTF-8">
<title>prime page </title>
</head>
<body>
<h1 align ="center">This is Prime Numbers</h1>

<br>

<%
  String val = request.getParameter("number");

int limit = Integer.parseInt(val);

 for(int num = 2; num <= limit; num++ ){
	  boolean isPrime = true;
	  
	 for(int j=2;j<=Math.sqrt(num);j++){
		 
		 if(num % j == 0){
			 isPrime = false;
			 break;
		 }
	 }
	 
	 if(isPrime){
		 out.print(num + ",");
	 }
 }

%>

</body>
</html>