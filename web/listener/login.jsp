<%@ page import="java.util.Locale" %>
<%@ page import="java.util.ResourceBundle" %><%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/10/23
  Time: 20:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>国际化登录测试</title>
</head>
<body>
<%
    Locale locale = request.getLocale();
    ResourceBundle rb = ResourceBundle.getBundle("res",locale);
%>

<h1><%=rb.getString("login")%></h1>
<form>
    <%=rb.getString("username")%><label>
    <input type="text" name="username">
</label>
    <%=rb.getString("password")%><label>
    <input type="password" name="password">
</label>
    <input type="submit" value="<%=rb.getString("login")%>">
</form>
</body>
</html>
