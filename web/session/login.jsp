<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/9/20
  Time: 19:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>

<head>
    <title>登录</title>
    <script type="text/javascript">
        function _change() {
            /*
                1.得到img元素
                2.修改其为/javaWeb/verify
             */
            var img = document.getElementById("img");
            //直接写成 img.src = "/javaWeb/verify"，浏览器不会更换图片，因为缓存了，这时需要加上一些无关项
            img.src = "<%=request.getContextPath()%>/verify?a=" + new Date().getTime();
        }
    </script>
</head>
<body>
<%--本页面提供登录表单，还要显示错误信息--%>
<h1>Login！</h1>
<%
    /*读取用户名为username的cookie
     *   如果为空显示:""
     *   否则显示cookie的值
     * */
    String username = "";
    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if ("username".equals(cookie.getName())) {
                username = cookie.getValue();
            }
        }
    }

%>

<%
    String message = "";
    String msg = (String) request.getAttribute("msg");
    if (msg != null) {
        message = msg;
    }
%>
<font color="red"><b><%=message%>
</b></font>

<form action="<%=request.getContextPath()%>/login" method="post">
    <%--把cookie中的username的值显示到框框中--%>
    用户名：<input type="text" name="username" title="用户名" value="<%=username%>"/><br/>
    密　码：<input type="password" name="password" id="pwd" title="密码"/><br/>
    验证码：<input type="text" name="verifyCode" title="验证码"/>
        <img id="img" src="<%=request.getContextPath()%>/verify" sizes="2">
        <a href="javascript:_change()">换一张</a>
        <br/>
    <input type="submit" value="登录"/>
</form>

</body>
</html>
