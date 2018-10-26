<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/10/7
  Time: 22:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>showCookie</title>
</head>
<body>
    <h1>${cookie.JSESSIONID}</h1>
    <%
        Cookie cookie = new Cookie("username","zhangSan");

    %>
</body>
</html>
