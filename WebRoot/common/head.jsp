<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1.0,maximum-scale=1.0,user-scalable=0">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="format-detection" content="telephone=no">
    <title>Index</title>
    <script src="/jsframe/js/init.js"></script>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                    aria-expanded="false" aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="/index.jsp">CRUD框架</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li><a href="#index">首页</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">模块<span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="javascript:loadBody('/views/resCatalog.html', null);">目录管理</a></li>
                        <li><a href="javascript:loadBody('/views/sysMenu.html', null);">菜单管理</a></li>
                        <li><a href="javascript:loadBody('/views/resFile.html', null);">文件管理</a></li>
                    </ul>
                </li>
                <li><a href="#contact">联系我们</a></li>
                <li><a href="#about">关于</a></li>
            </ul>
        </div>
    </div>
</nav>
