<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/9/30
  Time: 0:01
  To change this template use File | Settings | File Templates.

  这个页面静态包含lo.jsp页面
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>静态包含</title>
</head>
<body>
<%
    String name = "zhangSan";
    String pagePath = "lo.jsp";
    //被包含的变量是不能为变量的，
    // 因为此时的pagePath还是一个文本，
    // 不能直接被使用作为目标文件的地址，只有在编译之后，才有可能行得通
%>
<%--<%@include file="<%=pagePath%>"%>  被包含的变量是不能为变量的--%>
<%@include file="lo.jsp"%>
</body>
</html>
