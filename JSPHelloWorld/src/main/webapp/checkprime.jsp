<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> prime page</title>
</head>
<body>

<h1>This is Prime Numbers</h1>

<br>

<%
String val = request.getParameter("number");

int num = Integer.parseInt(val);

boolean isPrime = true;

	if(num<2){
		out.println("Is not prime or composite");
	}else{
		
		for(int i =2 ; i<= Math.sqrt(num);i++){
			if(num % i == 0){
				isPrime = false;
				break;
			}
		}
		
		if(isPrime){
			out.println(num +" is prime number");
		}else{
			out.println(num +" is not prime number");
		}
	}

	


%>


</body>
</html>