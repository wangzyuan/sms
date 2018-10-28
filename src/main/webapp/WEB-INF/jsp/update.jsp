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
            width: 50%;
            margin: 0 auto;
        }
        .see tr td span:hover{
            cursor: pointer;
        }
    </style>


</head>
<script type="text/javascript" src="../../static/jquery-2.1.0.js"></script>


<body>
<img src="../../static/img/头像 男孩.png" alt="头像" style="width:150px;height:150px;">
<form id="updateForm"  action="/update" method="post">
<table class="see" cellspacing="100px">

    <c:forEach items="${list}" var="s">
    <tr>
        <td>
            <b>姓名:</b>
            <%--<span>${s.name}</span>--%>
            <input type="text" name="name" size="30" id="name" style="width: 50%" value="${s.name}" />
        </td>
        <td>
            <b>性别:</b>
            <input type="text" name="sex" size="30" id="sex" style="width: 50%" value="<c:if test="${s.sex==1 }">男</c:if> <c:if test="${s.sex==0 }">女</c:if>" />
        </td>

        <td>
            <b>年龄:</b>
            <input type="text" name="age" size="30" id="age" style="width: 50%" value="${s.age}" />
        </td>

    </tr>
    <tr>
        <td>
            <b>学号:</b>
            <input type="text" name="sid" size="30" id="sid" style="width: 50%" value="${s.sid}" />
        </td>

        <td>
            <b>班级:</b>
            <input type="text" name="sclass" size="30" id="sclass" style="width: 50%" value="${s.sclass}" />
        </td>
        <td>
            <b>导员:</b>
            <input type="text" name="teacher" size="30" id="teacher" style="width: 50%" value="${s.teacher}" />
        </td>
    </tr>
    <tr>
        <td>
            <b>创建时间:</b>
            <span>${s.create_time}</span>
        </td>
        <td>
            <b>入学年份:</b>
            <input type="text" name="year" size="30" id="year" style="width: 50%" value="${s.year}" />
        </td>
        <td>
            <b>状态:</b>
            <span>${s.status}</span>
        </td>
        <td style="display: none">
            <input type="text" name="status" value="${s.status}"/>
    </tr>
        <td style="display: none">
            <input type="text" name="create_time" value="${s.create_time}"/>
    </tr>


    </tr>
    </c:forEach>
</table>
</form>
<button onclick="b()">提交</button>
<button onclick="c()">取消</button>
</body>
<script>
    function change_name(obj){
        var o=obj.previousElementSibling;
        o.innerHTML="<input value='' style='display:inline-block;width:70px'/>"
    }
    function b() {
        var sex = $("#sex");

        if ($.trim(sex.val())=="男"){
            sex.val(1)
        }else{
            sex.val(0)
        }



        $("#updateForm").submit();

    }
</script>
</html>