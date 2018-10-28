<%--
  Created by IntelliJ IDEA.
  User: gonghang
  Date: 2018/10/26
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title></title>
    <link href="../../static/main1.css" rel="stylesheet" type="text/css">
    <script>

    </script>
</head>
<body>
<div id="header">
    <div class="img"><img src="../../static/img/header.gif"></div>
</div>
<div id="main">
    <div class="left"><img src="../../static/img/left.jpg"></div>
    <div class="right">
        <div class="dao">
            <img src="../../static/img/dao_img.gif">
            <p>首页</p>
            <p>学生管理</p>
            <p>学生信息变更管理</p>
            <p>学生信息调整</p>
        </div>
        <div class="search">
            <div class="name">
                <p>姓名：</p>
                <input class="input1" type="text">
            </div>
            <div class="cLass">
                <p>学号：</p>
                <input class="input1" type="text">
            </div>
            <img style="margin-top: 12px; margin-left: 20px;" src="../../static/img/search.gif">
            <img style="margin-top: 0; margin-left: 15px;" src="../../static/img/add.gif">
        </div>
        <div class="con">
            <span><img src="../../static/img/kuai.gif"></span>
            <p>姓名</p>
            <p>年龄</p>
            <p>性别</p>
            <p>班级</p>
            <p>老师</p>
            <p>创建时间</p>
            <p>入学年份</p>
            <p>状态</p>
            <p>学号</p>
            <p>操作</p>
        </div>
        <table style="border: 1px solid #cccccc;">
            <c:forEach items="${list}" var="stu">
                <tr>
                    <td style="width:70px;"><img src="../../static/img/kuai.png" id="img1"></td>
                    <td style="width:70px;">${stu.name}</td>
                    <td style="width:70px;">${stu.age}</td>
                    <td style="width:50px;">
                        <c:if test="${stu.sex==1 }">
                            男
                        </c:if> <c:if test="${stu.sex==0 }">
                        女
                    </c:if>
                    </td>
                    <td style="width:80px;">${stu.sclass}</td>
                    <td style="width:60px;">${stu.teacher}</td>
                    <td style="width:95px;">${stu.create_time}</td>
                    <td style="width:92px;">${stu.year}</td>
                    <td style="width:55px;">${stu.status}</td>
                    <td style="width:55px;">${stu.sid}</td>
                    <td style="width:70px;">
                        <a href=""><img src="../../static/img/eye.gif"></a>
                        <a href=""><img src="../../static/img/laji.gif"></a>
                        <a href=""><img src="../../static/img/change1.gif"></a>
                    </td>
                </tr>

            </c:forEach>
        </table>
    </div>
</div>


</body>
</html>
