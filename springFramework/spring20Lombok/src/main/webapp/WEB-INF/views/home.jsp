<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>
<P>  ${vo_default} </P>
<P>  ${vo_lombok} </P>
<P>  ${vo_data} </P>
<P> <a href="json_default.do">json_default.do</a> </P>
<P> <a href="json_lombok.do">json_lombok.do</a> </P>
<P> <a href="json_data.do">json_data.do</a> </P>
</body>
</html>
