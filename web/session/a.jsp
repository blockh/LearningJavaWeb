<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/9/17
  Time: 21:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>a.jsp</title>
</head>
<body>
    <h1>向session域中保存数据</h1>
    <%
        //HttpSession session1 = request.getSession();可以通过request获取session
        session.setAttribute("aaa","AAA");
    %>


    //测试当用户禁用所有cookie之后如何给服务器传递SESSIONID<br/>
    //需要在每一个请求或者表单后面都要加上一个sessionId<br/>
    <a href= "<%=request.getContextPath()%>/aServlet;JSESSIONID=<%=session.getId()%>">点击这里</a>
    <a href= "<%=request.getContextPath()%>/aServlet;JSESSIONID=<%=session.getId()%>">点击这里</a>
    <a href= "<%=request.getContextPath()%>/aServlet;JSESSIONID=<%=session.getId()%>">点击这里</a>
    <br/>
    //这里有着很智能的方法：response.encodeURL(String url)<<br/>
    //该方法会对URL进行智能的重写，当请求中还没有归还这sessionId这个cookie，那么该方法会重写URL，否者不会重写！当然URL必须指向本站的url。<br/>
    <%
        out.println(response.encodeURL(request.getContextPath() + "/aServlet"));
    %>
</body>
</html>
