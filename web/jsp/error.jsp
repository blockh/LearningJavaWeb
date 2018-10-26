<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/9/27
  Time: 22:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<head>
    <title>错误测试页面</title>
</head>
<body>
啊哦。。。出错了哦
<%
    exception.printStackTrace(response.getWriter());
    //一般不会给用户看到这些东西，写成本网站正在维护中，或者小人图片
%>
</body>
</html>
