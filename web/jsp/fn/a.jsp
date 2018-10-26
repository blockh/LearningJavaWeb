<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/10/10
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%--导入jstl的标签库--%>
<html>
<head>
    <title>JSTL提供的EL函数库</title>
</head>
<body>
<h1>JSTL提供的EL函数库</h1>
<%
    String[] strs = {"a", "b","c"};
    List list = new ArrayList();
    list.add("a");

    pageContext.setAttribute("arr",strs);
    pageContext.setAttribute("list",list);
    session.setAttribute("session_list",list);

%>
${fn:length(arr)}<%--使用全域查找--%>
${fn:length(session_list)}
</body>
</html>
