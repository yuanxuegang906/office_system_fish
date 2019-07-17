<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/16
  Time: 19:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title></title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <script src="/js/jquery.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/jquery-3.4.1.js"></script>
    <script>
        $(function () {
            $("#search").click(function () {
                var course = $("#course").val();
                $.post("getClassesByCourse",{course:course},function (result) {
                    $(".clazz").remove();
                    for(var i in result) {
                        $('#tb_list').append("<tr class='clazz' id='tr"+result[i].cid+"'><td>"+i+1+"</td><td>" +result[i].classname+
                            "</td><td>"+result[i].teacher.tname+"</td><td>"+result[i].manager.mname+"</td><td>"+result[i].course+"</td><td><button class='del' id='"+result[i].cid+"'>删除班级</button>&nbsp;<button class='update'>修改信息</button></td><tr>")
                    }
                },"json")
            });
            $(".del").click(function () {
                var cid = $(this).attr("id");
                $.post("delCourse",{cid:cid},function (d) {
                    alert(d);
                    $("#tr"+cid).remove();
                },"text")
            });
            $(".update").click(function () {
                window.location.href='updateClasses';
            });
        })
    </script>
</head>
<body>

<div class="row" style="width: 100%;">
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading">课程列表</div>
            <div class="panel-body">
                <!-- 条件查询 -->
                <form >
                    <div class="row">
                        <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                            <div class="form-group form-inline">
                                <span>课程名称</span>
                                <input type="text" name="name" class="form-control" id="course">
                            </div>
                        </div>

                        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                            <button type="button" class="btn btn-primary" id="search"><span class="glyphicon glyphicon-search"></span></button>
                        </div>

                    </div>
                </form>
                <!-- 列表显示 -->
                <table id="tb_list" class="table table-striped table-hover table-bordered">
                    <tr class='tr_head'><td>编号</td><td>班级名称</td><td>讲师</td><td>班主任</td><td>课程名</td><td>操作</td></tr>
                    <c:forEach items="${classes}" var="clazz" varStatus="i">
                        <tr class="clazz" id="tr${clazz.cid}">
                            <td>${i.count}</td>
                            <td>${clazz.classname}</td>
                            <td>${clazz.teacher.tname}</td>
                            <td>${clazz.manager.mname}</td>
                            <td>${clazz.course}</td>
                            <td><button class='del' id="${clazz.cid}">删除班级</button>&nbsp;<button class="update?sid=${clazz.cid}">修改信息</button></td>
                        </tr>
                    </c:forEach>
                </table>


            </div>
        </div>
    </div>
</div>
</body>
</html>