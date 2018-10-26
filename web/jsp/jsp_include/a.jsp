<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/10/2
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>a.jsp</title>
</head>
<body>
    <h1>a.jsp</h1>
    <%--动态包含，会文件里会生成两个servlet--%>
    <jsp:include page="b.jsp">
        <jsp:param name="username" value="zhangsan"/>
        <jsp:param name="password" value="12312345"/>
    </jsp:include>

    <%--转发--%>
    <%--<jsp:forward page="b.jsp"/>--%>
</body>
</html>
