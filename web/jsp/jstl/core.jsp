<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/10/10
  Time: 21:14
  To change this template use File | Settings | File Templates.
  使用jstl函数库
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>JSTL-core的使用</title>
</head>
<body>
<%
    //request.setAttribute("code","<script>alert('hello');</script>");
%>


<%--在request域中添加一个属性--%>
<c:set var="code" value="<script>alert('hello');</script>" scope="request"></c:set>

<%--${code}--%>
<%--不转义--%>
<c:out value="${code}" escapeXml="true"></c:out><br>

<!--/javaWeb/index.jsp?username=zhangsan-->
<c:url value="/index.jsp">
    <c:param name="username" value="zhangsan"/> <%--这个参数可以进行url编码--%>
</c:url>

<a href="<c:url value="/index.jsp"/> ">点击这里回到主页</a><br>

<c:set var="score" value="${param.score}"/>
<c:if test="${empty param.score}">
    您没有给出分数！

</c:if>
<c:choose>
    <c:when test="${score > 100 || score < 0}">错误的分数${score}</c:when>
    <c:when test="${score >= 90}">A级</c:when>
    <c:when test="${score >= 80}">B级</c:when>
    <c:when test="${score >= 70}">C级</c:when>
    <c:when test="${score >= 60}">D级</c:when>
    <c:otherwise>E级 </c:otherwise><%--包括score不存在的情况--%>
</c:choose>


<c:if test="${empty param.name}">
    您没有给出名为name的参数
</c:if><br>


<%--使用循环变量--%>
<c:forEach var="i" begin="1" end="10" step="2"><%--step：步长--%>
    这是第${i}次输出<br>
</c:forEach>


<%--遍历集合--%>
<%
    String[] strs = {"one","two","three","four","five","six"};
    request.setAttribute("strs",strs);
%>
<c:forEach items="${strs}" var="str">
    ${str}<br>
</c:forEach>

<%
    List<String> names = new ArrayList<>();
    names.add("张三");
    names.add("李四");
    names.add("王五");
    names.add("赵六");

    pageContext.setAttribute("names",names);
%>
<c:forEach var="item" items="${strs}" varStatus="vs" step="2">
    <c:if test="${vs.first}">第一行</c:if><%--ruguo是第一行则为true--%>
    <c:if test="${vs.last}">最后一行</c:if><%--如果是最后一行则为true--%>
    <c:out value="第[${vs.count}]次输出"/><%--返回行数，从1开始--%>
    <c:out value="元素的角标为[${vs.index}]"/><%--返回角标，从0开始--%>
    <c:out value="name:[${vs.current}]"/><%--当前项与${item}一样--%>
    <br>
</c:forEach>
</body>
</html>
