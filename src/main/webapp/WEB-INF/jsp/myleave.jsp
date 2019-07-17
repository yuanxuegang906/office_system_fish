<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/13
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <th>序号</th>
        <th>请假人</th>
        <th>开始时间</th>
        <th>结束时间</th>
        <th>请假理由</th>
        <th>请假进度</th>
    </tr>
    <c:if test="${leaves.size()>0}">
    <c:forEach items="${leaves}" var="leave" varStatus="i">
        <tr id="tr${leave.lid}">
            <td>${i.count}</td>
            <td>${leave.username}</td>
            <td>${leave.starttime}</td>
            <td>${leave.endtime}</td>
            <td>${leave.reason}</td>
            <td>
                <c:if test="${leave.flag==0}">审批中</c:if>
                <c:if test="${leave.flag==1}">已通过</c:if>
            </td>
        </tr>
    </c:forEach>
    </c:if>
</table>

</body>
</html>
