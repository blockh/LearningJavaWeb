<%@ page import="domain.Address" %>
<%@ page import="domain.Employee" %>
<%--
  Created by IntelliJ IDEA.
  User: you and when
  Date: 2018/10/5
  Time: 2:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>employee</title>
</head>
<body>
    <%
        Address address = new Address();
        address.setCity("襄阳");
        address.setStreet("隆中大道");

        Employee employee = new Employee();
        employee.setName("大平平");
        employee.setSalary(24453);
        employee.setAddress(address);

        request.setAttribute("emp",employee);
    %>
    <%--${emp}--%>
    <%--拿到属性值的方法--%>
    <h1>使用el获取request域中的emp</h1>
    ${requestScope.emp.address.street}
    <%--相当于(Employee)request.getAttribute("emp").getAddress().getStreet()--%>
</body>
</html>
