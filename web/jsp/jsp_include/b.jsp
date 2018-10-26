<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/10/2
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>b.jsp</title>
</head>
<body>
    <h1>b.jsp</h1>
    <%
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        out.print(username + "," + password);
    %>
</body>
</html>
