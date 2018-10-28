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
            <span>女</span>
            <span onclick="change_name(this)">修改</span>
        </td>

        <td>
            <b>年龄:</b>
            <span>22</span>
            <span onclick="change_name(this)">修改</span>
        </td>

    </tr>
    <tr>
        <td>
            <b>学号:</b>
            <span>4918</span>
            <span onclick="change_name(this)">修改</span>
        </td>

        <td>
            <b>班级:</b>
            <span>星火三班</span>
            <span onclick="change_name(this)">修改</span>
        </td>
        <td>
            <b>导员:</b>
            <span>刘丽娜</span>
            <span onclick="change_name(this)">修改</span>
        </td>
    </tr>
    <tr>
        <td>
            <b>创建时间:</b>
            <span>2018.10.22</span>
            <span onclick="change_name(this)">修改</span>
        </td>
        <td>
            <b>入学年份:</b>
            <span>2018年</span>
            <span onclick="change_name(this)">修改</span>
        </td>
        <td>
            <b>状态:</b>
            <span>000</span>
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