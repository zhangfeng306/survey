<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="description" content="">
    <meta name="Author" content="">
    <title>环鎏陆升</title>
    <!-- 新 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap/css/bootstrap-theme.min.css"/>
    <!-- 可选的Bootstrap主题文件（一般不使用） -->
    <!-- <script src="./bootstrap/css/bootstrap-theme.min.css"></script> -->
    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script type="text/javascript" src="${pageContext.request.contextPath }/css/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/index.js"></script>

    <style type="text/css">
        .background-pic{
            background: url("${pageContext.request.contextPath }/image/background.jpg") no-repeat center center;
            background-size:cover;
            background-attachment: fixed;
            width: 100%;
            height: 100%;
            position: fixed;
            top:0;
            left:0;
            right:0;
            bottom:0;
        }
    </style>
</head>
<body>
<div class="navbar-wrapper">
    <div class="container">

        <nav class="navbar navbar-inverse navbar-static-top">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="#">首页</a></li>
                        <li><a href="#about">公司介绍</a></li>
                        <li><a href="#contact">活动介绍</a></li>
                        <li><a href="${pageContext.request.contextPath }/vote/question">市场调查</a></li>
                        <li><a href="#contact">联系方式</a></li>
                    </ul>
                </div>
            </div>
        </nav>
    </div>

    <div class="background-pic">

    </div>

</div>

</body>
</html>