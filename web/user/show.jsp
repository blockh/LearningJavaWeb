<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/10/16
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>显示user</title>
</head>
<body>
<h1>这里显示user</h1>

<h3>
username：${user.username}<br>
password：${requestScope.user.password}<br>
</h3>
</body>
</html>
