<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/10/13
  Time: 21:07
  To change this template use File | Settings | File Templates.
  使用fmt标签库
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>使用fmt标签库</title>
</head>
<body>
<%
    Date date = new Date();
    request.setAttribute("date", date);
%>
<%--格式化时间--%>
<fmt:formatDate value="${requestScope.date}" pattern="yyyy-MM-dd HH:mm:ss"/>

<%
    request.setAttribute("Pi",3.1415926);
%>
<%--格式化数字--%>
<fmt:formatNumber value="${Pi}" pattern="0.000"/><%--最后一位的下一位，四舍五入--%>
</body>
</html>
