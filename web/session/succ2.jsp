<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/9/20
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>成功2</title>
</head>
<body>
<h1>成功2</h1>
<%
    String username = (String)session.getAttribute("username");
    if (username == null){
        /*
            1.向request域中保存错误信息，转发到login.jsp
         */
        request.setAttribute("msg","您还没有登录");
        request.getRequestDispatcher("/session/login.jsp").forward(request,response);
    }
%>
<%=session.getAttribute("username")%>欢迎您
</body>
</html>
