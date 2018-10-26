<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/9/27
  Time: 22:04
  To change this template use File | Settings | File Templates.
  测试当前页面出错后跳转到errorPage的页面为error.jsp
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int a = 10 / 0;
%>
</body>
</html>
