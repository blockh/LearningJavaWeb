<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/9/17
  Time: 21:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>b.jsp</title>
</head>
<body>
    <h1>获取session中的数据</h1>
    <%
        String aaa = (String) session.getAttribute("aaa");
    %>
    <%=aaa%>
</body>
</html>
