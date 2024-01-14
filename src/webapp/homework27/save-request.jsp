<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Save form</title>
    <style>
        #errorMessage{
            color: #ED1D24;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <form action="/save-request" method="post">
        First name: <input name="firstname" required/>
        <br>
        Last name: <input name="lastname" required/>
        <br>
        Email: <input type="email" name="email" required/>
        <br>
        Password: <input type="password" name="password" required/>
        <br>
        Confirm password: <input type="password" name="confirmPassword" required/>
        <br>
        <input type="submit" value="Login">
        <p id="errorMessage">
            <%=request.getAttribute("errorMessage")%>
        </p>
    </form>
</body>
</html>