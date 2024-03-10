<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset = UTF-8" %>
<html>
<head>
    <title>User</title>
</head>
<body>
<h1>Users</h1>
<p>
    <a href="/users/create">Create User</a>
</p>
<table>
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
        <th>Country</th>
        <th>Email</th>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.getFirstName()}</td>
            <td>${user.getLastName()}</td>
            <td>${user.getAge()}</td>
            <td>${user.getCountry()}</td>
            <td>${user.getEmail()}</td>
            <td>
                <form method="get" action="/users/${user.getId()}/edit">
                    <input type="submit" value="Edit">
                </form>
            <td>
            <td>
                <form method="post" action="/users/${user.getId()}/delete">
                    <input type="submit" value="Delete">
                </form>
            <td>
        </tr>
    </c:forEach>
</table>
</body>
</html>