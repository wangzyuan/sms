<%--
  Created by IntelliJ IDEA.
  User: gqx
  Date: 2018/10/28
  Time: 17:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>添加页面</title>
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
<img  src="../../static/img/boy_head.png" alt="头像" style="width:150px;height:150px;">
<form id="exam" name="exam" action ="/add" method="post">
<table class="see" cellspacing="100px">
    <tr>
        <td>
            <b>姓   名:</b>
            <input id="tit1" style='display:inline-block;width:70px' name = "name"  onclick="temp1()" >
            <span id="pop1"></span>
        </td>
        <td>
            <b>性   别:</b>
            <input type="radio" name="sex" value='1'/><label>男</label>
            <input name="sex" checked type="radio" value="0"/><label>女</label>
        </td>
        <td>
            <b>年   龄:</b>
            <input id="tit3" style='display:inline-block;width:70px' name = "age" >
            <span id="pop3"></span>
        </td>
    </tr>
    <tr>
        <td>
            <b>学   号:</b>
            <input id="tit4" style='display:inline-block;width:70px' name = "sid" >
            <span id="pop4"></span>
        </td>
        <td>
            <b>班   级:</b>
            <input id="tit5" style='display:inline-block;width:70px' name = "sclass" >
            <span id="pop5"></span>
        </td>
        <td>
            <b>导   员:</b>
            <input id="tit6" style='display:inline-block;width:70px' name = "teacher" >
            <span id="pop6"></span>
        </td>
    </tr>
    <tr>
        <td>
            <b>创建时间:</b>
            <input id="tit7" style='display:inline-block;width:70px' name = "create_time">
            <span id="pop7"></span>
        </td>
        <td>
            <b>入学年份:</b>
            <input id="tit8" style='display:inline-block;width:70px' name = "year" >
            <span id="pop8"></span>
        </td>
        <td>
            <b>状   态:</b>
            <input id="tit9" style='display:inline-block;width:70px' name = "status" value="1"  type="hidden">
            <span id="pop9"></span>
        </td>
    </tr>
</table>
<button type="submit" onclick="b()">提交</button>
</form>
<button onclick="c()">取消</button>
<script>
    function b() {
        var name1 = document.getElementById("tit1").value;
        var name2 = document.getElementById("tit2").value;
        if(name2 == "男") {
            document.getElementById('tit2').innerHTML = '1';
        }
        if(name2 == "女") {
            document.getElementById('tit2').innerHTML = '0';
        }
        var name3 = document.getElementById("tit3").value;
        var name4 = document.getElementById("tit4").value;
        var name5 = document.getElementById("tit5").value;
        var name6 = document.getElementById("tit6").value;
        var name7 = document.getElementById("tit7").value;
        var name8 = document.getElementById("tit8").value;
        var name9 = document.getElementById("tit9").value;
        var pop1 = document.getElementById("pop1");
        var pop2 = document.getElementById("pop2");
        var pop3 = document.getElementById("pop3");
        var pop4 = document.getElementById("pop4");
        var pop5 = document.getElementById("pop5");
        var pop6 = document.getElementById("pop6");
        var pop7 = document.getElementById("pop7");
        var pop8 = document.getElementById("pop8");
        var pop9 = document.getElementById("pop9");
        if (name1 == "") {
            pop1.innerHTML = "请输入姓名";
        } else {
            pop1.innerHTML = " ";
            if (name2 == "") {
                pop2.innerHTML = "请输入";
            } else {
                pop2.innerHTML = "";
                if (name3 == "") {
                    pop3.innerHTML = "请输入";
                } else {
                    pop4.innerHTML = "";
                    if (name4 == "") {
                        pop4.innerHTML = "请输入";
                    } else {
                        pop4.innerHTML = "";
                        if (name5 == "") {
                            pop5.innerHTML = "请输入";
                        } else {
                            pop5.innerHTML = "";
                            if (name6 == "") {
                                pop6.innerHTML = "请输入";
                            } else {
                                pop6.innerHTML = "";
                                if (name7 == "") {
                                    pop7.innerHTML = "请输入";
                                } else {
                                    pop7.innerHTML = "";
                                    if (name8 == "") {
                                        pop8.innerHTML = "请输入";
                                    } else {
                                        pop8.innerHTML = "";
                                        if (name9 == "") {
                                            pop9.innerHTML = "请输入";
                                        } else {
                                            pop9.innerHTML = "";
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
    function c(){
        window.location.href='/find';//点击返回，返回到上一页
    }
</script>
</body>
</html>