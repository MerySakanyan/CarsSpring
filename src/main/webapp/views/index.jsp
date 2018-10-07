<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>

<html>
<head>
    <title>Tittle Page</title>
</head>
<body>
<h2>Welcome</h2>

<%if(request.getAttribute("notification")!=""&&request.getAttribute("notification")!=null){%>
<span><%=request.getAttribute("notification")%></span>
<%}

%><br/><br/>
<form action="login" method="post"  >
    1   email    <input type="text" name="email"/><br/><br/>
    2   password <input type="text" name="password"><br/><br/>
    <input type="submit" value="login"/>
</form><br/><br/>


<a href="goToRegisterPage">register</a>


</body>
</html>
