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
    <title>index</title>

    <!-- 引入jquery -->
    <script type="text/javascript" src="static/js/jquery.min.js"></script>

    <!-- 引入样式 -->
    <link href="static/bootstrap-4.0.0-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="static/bootstrap-4.0.0-dist/js/bootstrap.min.js"></script>
</head>
<body>
<%--<div class="container" style="padding: 5px">--%>
    <%--<div class="input-group" style="width: 200px">--%>
        <%--用户名称：<input id="userName" type="text" class="form-control" placeholder="UserName">--%>
    <%--</div>--%>
    <%--<div class="input-group" style="width: 200px;margin-top: 5px">--%>
        <%--用户密码：<input id="passWord" type="text" class="form-control" placeholder="PassWord">--%>
    <%--</div>--%>
    <%--<div class="input-group" >--%>
        <%--<button id="loginBtn" onclick="initData()" type="button" class="btn btn-primary" style="width: 200px;margin-top: 5px">登录</button>--%>
    <%--</div>--%>
<%--</div>--%>
<div>
    <div class="loginbox-or">
        <div class="or-line"></div>
        <div class="or">登录</div>
    </div>
    <form role="form" role="form" action="${path}/userInfo/do">
        <div class="loginbox-textbox">
            <input type="text" class="form-control" name="acc_name" placeholder="账号" />
        </div>
        <div class="loginbox-textbox">
            <input type="text" class="form-control" name="password" placeholder="密码" />
        </div>
        <div class="m-row">
            <label class="l m-rowLabel">验证码：</label>
            <div class="l m-holderBox" style="width:115px;">
                <input class="m-holderInput m-textFocus" name="verifyCode" type="text" id="verifyCode" style="width:100px;" maxlength="4">
            </div>
            <img class="validate" src="${path}/codeMaker" title="点击图片刷新验证码" onclick="changeImg();" name="imgCode" id="imgCode">
            <a class="space_mr" href="javascript:changeImg();">看不清？换图片</a>
        </div>
        <div class="loginbox-forgot">
            <a href="">忘记密码?</a>
        </div>
        <div class="loginbox-submit">
            <button type="submit" class="btn btn-primary btn-block">登录</button>
        </div>
    </form>
    <div class="loginbox-signup">
        <div class="social-title ">请使用IE8以上版本、chrome、Safari等浏览器</div>
    </div>
</div>
</body>
<script>

    function initData() {
            var userNameVal = $("#userName").val().trim();
            var passWordVal = $("#passWord").val().trim();
            var datas = {
                "employeeNo":userNameVal,
                "password":passWordVal
            };

            console.log(userNameVal + passWordVal)
            $.ajax({
                type:'POST',
                contentType: "application/text",
                data:JSON.stringify(datas),
                url:'${path}/userInfo/loginByEmployee',
                dataType:"JSON",
//                success:function (data){
//                    console.log(data)
//                    var loginData = JSON.parse(data);
//                    if(loginData.resultCode === 200){
//                        location.href("/views/home");
//                        console.log("登录成功")
//                        alert("登录成功");
//                    }
//                }
            });
    }

    function changeImg()
    {
        $("#imgCode").attr("src","${path}/codeMaker?rand="+Math.random());
    }
</script>
</html>

