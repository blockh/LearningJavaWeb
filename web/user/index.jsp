<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/10/16
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>user示例项目的主页</title>
</head>
<body>
    <%--<h3><a href="${pageContext.request.contextPath}/showUser">点击显示用户</a></h3>--%>

    <h3><a href="<c:url value="/showUser"/> ">点击显示用户</a></h3>
</body>
</html>
