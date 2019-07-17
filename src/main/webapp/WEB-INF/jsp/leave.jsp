<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/10
  Time: 19:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/leave" method="post">
    <input type="hidden" name="state" value="${identity}">
    开始时间：<input type="text" name="starttime"><br>
    结束时间：<input type="text" name="endtime"><br>
    请假理由：<input type="text" name="reason"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
