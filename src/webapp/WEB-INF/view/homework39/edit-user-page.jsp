<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Edit user</title>
</head>
<body>
<h2>Edit user</h2>
<form:form method="post" action="/users/${user.getId()}/edit" modelAttribute="user">
  <table>
    <tr>
      <td>First Name:</td>
      <td><form:input path="firstName"/></td>
    </tr>
    <tr>
      <td>Last Name:</td>
      <td><form:input path="lastName"/></td>
    </tr>
    <tr>
      <td>Age:</td>
      <td><form:input path="age"/></td>
    </tr>
    <tr>
      <td>Country:</td>
      <td><form:input path="country"/></td>
    </tr>
    <tr>
      <td>Email:</td>
      <td><form:input path="email"/></td>
    </tr>
    <tr>
      <td>
        <input type="submit" value="Edit"/>
      </td>
    </tr>
  </table>
</form:form>

<a href="/users">Main page</a>
</body>
</html>