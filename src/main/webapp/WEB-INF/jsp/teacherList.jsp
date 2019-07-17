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
                var name = $("#name").val();
                $.post("getTeacherByName",{name:name},function (result) {
                    $(".teacher").remove();
                    for(var i in result) {
                        $('#tb_list').append("<tr class='teacher' id='tr"+result[i].tid+"'><td>"+i+1+"</td><td>" +result[i].tname+
                            "</td><td>"+result[i].tsex+"</td><td>"+result[i].tage+"</td><td>"+result[i].username+"</td><td><button class='del' id='"+result[i].tid+"'>删除</button>&nbsp;<button class='res' name='"+result[i].tid+"'>重置密码</button></td><tr>")
                    }
                },"json")
            });
            $(".del").click(function () {
                var tid = $(this).attr("id");
                $.post("delTeacher",{tid:tid},function (d) {
                    alert(d);
                    $("#tr"+tid).remove();
                },"text")
            });
            $(".res").click(function () {
                var tid =$(this).attr("name");
                $.post("resTeacherPassword",{tid:tid},function (d) {
                    alert(d);
                },"text")
            });
        })
    </script>
</head>
<body>

<div class="row" style="width: 100%;">
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading">讲师列表</div>
            <div class="panel-body">
                <!-- 条件查询 -->
                <form >
                    <div class="row">
                        <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                            <div class="form-group form-inline">
                                <span>用户姓名</span>
                                <input type="text" name="name" class="form-control" id="name">
                            </div>
                        </div>
                        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                            <div class="form-group form-inline">
                                <span>性别</span>
                                &nbsp;&nbsp;&nbsp;&nbsp;
                                <label class="radio-inline">
                                    <input type="radio" name="gender" value="男"> 男&nbsp;&nbsp;&nbsp;&nbsp;
                                </label>
                                <label class="radio-inline">
                                    <input type="radio"name="gender" value="女"> 女
                                </label>
                            </div>
                        </div>
                        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                            <button type="button" class="btn btn-primary" id="search"><span class="glyphicon glyphicon-search"></span></button>
                        </div>

                    </div>
                </form>
                <!-- 列表显示 -->
                <table id="tb_list" class="table table-striped table-hover table-bordered">
                    <tr class='tr_head'><td>编号</td><td>姓名</td><td>性别</td><td>年龄</td><td>用户名</td><td>操作</td></tr>
                    <c:forEach items="${teachers}" var="teacher" varStatus="i">
                        <tr class="teacher" id="tr${teacher.tid}">
                            <td>${i.count}</td>
                            <td>${teacher.tname}</td>
                            <td>${teacher.tsex}</td>
                            <td>${teacher.tage}</td>
                            <td>${teacher.username}</td>
                            <td><button class='del' id="${teacher.tid}">删除</button>&nbsp;<button class='res' name="${teacher.tid}">重置密码</button></td>
                        </tr>
                    </c:forEach>
                </table>


            </div>
        </div>
    </div>
</div>
</body>
</html>