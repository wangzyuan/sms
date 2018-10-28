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
    <link href="main1.css" rel="stylesheet" type="text/css">
    <script>
    </script>
</head>
<body>
<div id="header">
    <div class="img"><img src="img/header.gif"></div>
</div>
<div id="main">
    <div class="left"><img src="img/left.jpg"></div>
    <div class="right">
        <div class="dao">
            <img src="img/dao_img.gif">
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
            <img style="margin-top: 12px; margin-left: 20px;" src="img/search.gif">
            <img style="margin-top: 0; margin-left: 15px;" src="img/add.gif">
        </div>
        <div class="con">
            <span><img src="img/kuai.gif"></span>
            <p>姓名</p>
            <p>年龄</p>
            <p>性别</p>
            <p>班级</p>
            <p>老师</p>
            <p>创建时间</p>
            <p>入学年份</p>
            <p>状态</p>
            <p>操作</p>
        </div>
        <table style="border: 1px solid #cccccc;">
            <c:forEach items="${list}" var="stu">
                <tr>
                    <td style="width:70px;"><img src="img/kuai.png" id="img1"></td>
                    <td style="width:70px;">黄彩云</td>
                    <td style="width:70px;">21</td>
                    <td style="width:50px;">女</td>
                    <td style="width:80px;">星火三期</td>
                    <td style="width:60px;">李廷</td>
                    <td style="width:95px;">2018-10-22</td>
                    <td style="width:92px;">2015-9-1</td>
                    <td style="width:55px;">在职</td>
                    <td style="width:70px;">
                        <a href=""><img src="img/eye.gif"></a>
                        <a href=""><img src="img/laji.gif"></a>
                        <a href=""><img src="img/change1.gif"></a>
                    </td>
                </tr>

            </c:forEach>
            <tr>
                <td style="width:70px;"><img src="img/kuai.png" id="img1"></td>
                <td style="width:70px;">黄彩云</td>
                <td style="width:70px;">21</td>
                <td style="width:50px;">女</td>
                <td style="width:80px;">星火三期</td>
                <td style="width:60px;">李廷</td>
                <td style="width:95px;">2018-10-22</td>
                <td style="width:92px;">2015-9-1</td>
                <td style="width:55px;">在职</td>
                <td style="width:70px;">
                    <a href=""><img src="img/eye.gif"></a>
                    <a href=""><img src="img/laji.gif"></a>
                    <a href=""><img src="img/change1.gif"></a>
                </td>
            </tr>
        </table>
    </div>
</div>


</body>
</html>
