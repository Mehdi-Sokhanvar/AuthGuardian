<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>

<body>
<spring:url value="/login" var="loginUrl"/>
<%--<a href="">Login</a>--%>

<form action="${homeUrl}" method="post">
    <label>
        <input type="text" name="userName" placeholder="Username">
    </label>

    <label>
        <input type="text" name="password" placeholder="Password">
    </label>

    <label>
        <input type="text" name="email" placeholder="Email">
    </label>

    <input type="submit" value="submit">
</form>
</body>
</html>
