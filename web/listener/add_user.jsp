<%@ page import="listener.User" %><%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/10/22
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <%
        User user = new User();
        session.setAttribute("user",user);
    %>
</body>
</html>
