<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/css/bootstrap.min.css" />
    <script src="/js/jquery.min.js"></script>
    <script src="/js/bootstrap.min.js"></script>
    <script src="/js/DatePicker.js"></script>
    <title>商品添加页面</title>
</head>
<body>
<div class="row" style="margin-left: 20px;">
    <form action="/addClasses" method="post">
        <div>
            <h3>新增商品</h3>
        </div>
        <hr />
        <div class="row">
            <div class="col-sm-6">
                <p style="color:red"></p>
                <div class="form-group form-inline">
                    <label>班级名称:</label>
                    <input type="text" name="classname" class="form-control" />
                </div>
                <div class="form-group form-inline">
                    <label>课程名称:</label>
                    <input type="text" name="course" class="form-control"/>
                </div>
                <div class="form-group form-inline">
                    <label>讲师:</label>&nbsp;&nbsp;&nbsp;
                    <select name="mid" class="form-control">
                        <option value="0">---请选择讲师--</option>
                        <c:forEach items="${managers}" var="manager">
                            <option value="${manager.mid}">${manager.mname}</option>
                        </c:forEach>
                    </select>
                </div>
                <div class="form-group form-inline">
                    <label>班主任:</label>
                    <select name="tid" class="form-control">
                        <option value="0">---请选择班主任--</option>
                        <c:forEach items="${teachers}" var="teacher">
                            <option value="${teacher.tid}">${teacher.tname}</option>
                        </c:forEach>
                    </select>
                </div>

            </div>
        </div>
        <div class="row">
            <div class="col-sm-10">
                <div class="form-group form-inline">
                    <input type="submit" value="添加" class="btn btn-primary" />
                    <input type="reset" value="重置" class="btn btn-default" />
                </div>
            </div>
        </div>
    </form>
</div>
</body>
</html>