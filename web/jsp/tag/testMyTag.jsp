<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/10/15
  Time: 21:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="bh" uri="/blockhead" %>

<html>
<head>
    <title>使用自定义标签库</title>
</head>
<body>


<%--如果这个name参数为空,则执行--%>
<bh:mtTag5 test="${empty param.name}">
    <%--让页面跳过后面的内容--%>
    <bh:myTag4/>
</bh:mtTag5>

<h1><bh:myTag1/></h1>
<h1><bh:myTag2/></h1>


<%
    request.setAttribute("name","ZhangSan");
%>
<h2><bh:myTag3>${name}</bh:myTag3></h2>

<h2><bh:myTag4/></h2>

<br>
<font>
    你说啥你，你大爷的
</font>

</body>
</html>
