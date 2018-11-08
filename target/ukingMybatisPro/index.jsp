<%--
  Created by IntelliJ IDEA.
  User: huangl
  Date: 2018/11/2
  Time: 9:44 PM
  To change this template use File | Settings | File Templates.
--%>
<c:set value="${pageContext.request.contextPath }" var="path"></c:set>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
    <title>Title</title>

    <!-- 引入jquery -->
    <script type="text/javascript" src="static/js/jquery.min.js"></script>

    <!-- 引入样式 -->
    <link href="static/bootstrap-4.0.0-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="static/bootstrap-4.0.0-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container" style="padding: 5px">
    <div class="input-group" style="width: 200px">
        用户名称：<input id="userName" type="text" class="form-control" placeholder="UserName">
    </div>
    <div class="input-group" style="width: 200px;margin-top: 5px">
        用户密码：<input id="passWord" type="text" class="form-control" placeholder="PassWord">
    </div>
    <div class="input-group" >
        <button id="loginBtn" onclick="initData()" type="button" class="btn btn-primary" style="width: 200px;margin-top: 5px">登录</button>
    </div>
</div>
</body>
<script>

    function initData() {
            var userNameVal = $("#userName").val().trim();
            var passWordVal = $("#passWord").val().trim();
            var data = {
                "employee":userNameVal,
                "password":passWordVal
            };

            console.log(userNameVal + passWordVal)
            $.ajax({
                type:'POST',
                contentType: "application/text",
                data:JSON.stringify(data),
                url:'${path}/userInfo/loginByEmployee',
                success:function (data) {

                }
            });
    }
</script>
</html>

