<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/10/7
  Time: 22:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    ${pageContext.request.contextPath}<br><%--获取项目名--%>

    ${cookie.JSESSIONID.value}<br><%--使用cookie回去sessionId--%>
    ${pageContext.session.id}<%--获取sessionId--%>

    <a href="${pageContext.request.contextPath}/jsp/el/employee.jsp">点击这里跳转</a>

    <form action="${pageContext.request.contextPath}/jsp/el/cookie.jsp" method="post">
        <input type="submit" value="xccc">
    </form>
</body>
</html>
