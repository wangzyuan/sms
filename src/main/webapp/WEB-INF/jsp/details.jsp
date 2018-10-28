<%--
  Created by IntelliJ IDEA.
  User: gonghang
  Date: 2018/10/28
  Time: 5:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>查看详情页面</title>
    <style>
        body{
            background-color: lightblue;
            text-align: center;
        }
        .see{
            margin: 0 auto;
        }
    </style>
</head>
<body>
<img src="头像 男孩.png" alt="头像" style="width:150px;height:150px;">
<table class="see" cellspacing="100px">
    <c:forEach items="${list}" var="list">
        <tr>
            <td><b>姓   名:</b></td>
            <td>${list.name}</td>
            <td><b>性   别:</b></td>
            <td>
                <c:if test="${list.sex==1 }">
                男
                </c:if>
                <c:if test="${list.sex==0 }">
                女
                </c:if>
            </td>
            <td><b>年   龄:</b></td>
            <td>${list.age}</td>
        </tr>
        <tr>
            <td><b>学   号:</b></td>
            <td>${list.sid}</td>
            <td><b>班   级:</b></td>
            <td>${list.sclass}</td>
            <td><b>导   员:</b></td>
            <td>${list.teacher}</td>
        </tr>
        <tr>
            <td><b>创建时间:</b></td>
            <td>${list.create_time}</td>
            <td><b>入学年份:</b></td>
            <td>${list.year}</td>
            <td><b>状   态:</b></td>
            <td>${list.status}</td>
        </tr>

    </c:forEach>

</table>
<button onclick="a()">返回</button>
<script>
    function a(){
        window.location.href='window.history.back(-1)';//点击返回，返回到上一页
    }
</script>
</body>
</html>