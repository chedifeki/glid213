<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: chedi
  Date: 1/30/2024
  Time: 9:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>JSP Expression</h2>
    <ul>
        <li>Current Time : <%= new Date()%></li>
        <li>Hostname : <%= request.getRemoteHost()%></li>
        <li>Session ID : <%= session.getId()%></li>
        <li>testparam : <%= request.getParameter("testparam")%>< /li>
    </ul>
</body>
</html>
