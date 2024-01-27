<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Success page</title>
</head>
<body>
    <p>
        Заявка успешно сохранена!
    </p>
    <p>
        First name: <%=request.getParameter("firstname")%> <br>
        Last name:<%=request.getParameter("lastname")%> <br>
        Email: <%=request.getParameter("email")%>
    </p>
</body>
</html>
