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

<div>登录成功！Succeed!</div>
<div>昵称 ${info.nickname}</div>
<div>用户头像<img style="vertical-align: top" width="100" height="100" alt="" src="${info.headimgurl}" ></div>
</center>
</body>
</html>
