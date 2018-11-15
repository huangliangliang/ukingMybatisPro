<%--
  Created by IntelliJ IDEA.
  User: huangl
  Date: 2018/11/8
  Time: 9:35 PM
  To change this template use File | Settings | File Templates.
--%>
<c:set value="${pageContext.request.contextPath }" var="path"></c:set>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<head>
    <title>home</title>
    <!-- 引入jquery -->
    <script type="text/javascript" src="${path}/static/js/jquery.min.js"></script>

    <!-- 引入样式 -->
    <link href="${path}/static/bootstrap-4.0.0-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${path}/static/bootstrap-4.0.0-dist/js/bootstrap.min.js"></script>
</head>
<body>
<nav class="navbar nav-tabs">
    <div class="container-fluid">
        <div class="navbar-nav">
            <a class="navbar-brand" href="#">菜鸟教程</a>
        </div>

    </div>
</nav>
</body>
</html>
