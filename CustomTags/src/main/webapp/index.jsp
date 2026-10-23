<%@taglib prefix="myTag" uri="WEB-INF/mytag.tld"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom tags</title>
</head>
<body>
<h1>My Custom Tags Examples</h1>
<myTag:simpleDt/>
<br/>
<h3><myTag:numPow num="2"  pow="3"/></h3>
<br/>
<myTag:red>Hello this is Custom tag program</myTag:red>
</body>
</html>