<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
    <tr>
    <th>Username</th>
    <th>Password</th>
    <th>Email</th>
    </tr>
<c:forEach items="${users}" var="user">
    <tr>
        <td> ${user.userName}</td>
        <td> ${user.password}</td>
        <td> ${user.email}</td>
    </tr>
</c:forEach>
</table>
    </body>
    </html>
