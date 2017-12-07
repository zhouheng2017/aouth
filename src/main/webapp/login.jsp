<%--
  Created by IntelliJ IDEA.
  User: zhouheng
  Date: 2017/12/5
  Time: 15:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Title</title>
</head>
<body>
<center>
    <form action="/wxCallBack" method="post">
        <input type="text" name="account">
        <input type="password" name="password"/>
        <input type="hidden" name="openid" value="${openid}">
        <input type="submit" value="登录并绑定"/>

    </form>
</center>
</body>
</html>
