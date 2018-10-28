<%--
  Created by IntelliJ IDEA.
  User: gonghang
  Date: 2018/10/26
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>修改页面</title>
    <style>
        body{
            background-color: lightblue;
            text-align: center;
            width:100%;
        }
        .see{
            width: 100%;
            margin: 0 auto;
        }
        .see tr td span:hover{
            cursor: pointer;
        }
    </style>

</head>
<body>
<img src="../../static/img/头像 男孩.png" alt="头像" style="width:150px;height:150px;">

<table class="see" cellspacing="100px">

    <c:forEach items="${list}" var="s">
    <tr>
        <td>
            <b>姓名:</b>
            <span>${s.name}</span>
            <span onclick="change_name(this)">修改</span>
        </td>
        <td>
            <b>性别:</b>
            <span> <c:if test="${stu.sex==1 }">
                男
            </c:if> <c:if test="${stu.sex==0 }">
                女
            </c:if></span>
            <span onclick="change_name(this)">修改</span>
        </td>

        <td>
            <b>年龄:</b>
            <span>${s.age}</span>
            <span onclick="change_name(this)">修改</span>
        </td>

    </tr>
    <tr>
        <td>
            <b>学号:</b>
            <span>${s.sid}</span>
            <span onclick="change_name(this)">修改</span>
        </td>

        <td>
            <b>班级:</b>
            <span>${s.sclass}</span>
            <span onclick="change_name(this)">修改</span>
        </td>
        <td>
            <b>导员:</b>
            <span>${s.teacher}</span>
            <span onclick="change_name(this)">修改</span>
        </td>
    </tr>
    <tr>
        <td>
            <b>创建时间:</b>
            <span>${s.create_time}</span>
            <span onclick="change_name(this)">修改</span>
        </td>
        <td>
            <b>入学年份:</b>
            <span>${s.year}</span>
            <span onclick="change_name(this)">修改</span>
        </td>
        <td>
            <b>状态:</b>
            <span>${s.status}</span>
            <span onclick="change_name(this)">修改</span>
        </td>
    </tr>
    </c:forEach>
</table>
<button oncilck="b()">提交</button>
<button oncilck="c()">取消</button>
<script>
    function change_name(obj){
        var o=obj.previousElementSibling;
        o.innerHTML="<input value='' style='display:inline-block;width:70px'/>"
    }
</script>
</body>
</html>