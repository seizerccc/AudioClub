<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@include file="/WEB-INF/base.jsp" %>
<!-- 准许获取session的值-->
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="" />
    <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
    <!-- Custom Theme files -->
    <link href="../../css/bootstrap.css" type="text/css" rel="stylesheet" media="all">
    <link href="../../css/style.css" type="text/css" rel="stylesheet" media="all">
    <link href="../../css/font-awesome.css" rel="stylesheet">  <!-- font-awesome icons -->
    <!-- //Custom Theme files -->
    <!-- web-fonts -->
    <!--link href="http://fonts.googleapis.com/css?family=Roboto+Condensed:300,300i,400,400i,700,700i" rel="stylesheet">
    <!--link href="http://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">
    <!-- //web-fonts -->
    <!-- 页面跳转以及需要的js文件-->
    <script type="text/javascript">baselocation="${ctx}"</script>
    <script type="text/javascript" src="../../js/jquery-2.2.3.min.js"></script>
    <script type="text/javascript" src="../../js/systemJS/login.js"></script>
    <script type="text/javascript" src="../../js/systemJS/links.js"></script>
</head>

<body>
<!-- header -->
<div class="header">
    <nav class="navbar navbar-default">
        <div class="container">
            <div class="navbar-header navbar-left wthree">
                <h1><a id="home_tag" href="javascript:;">Audio<span>AudioClub</span></a></h1>
            </div>
            <!-- navigation -->
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <div class="header-right wthree">
                <div class="top-nav-text">
                    <p>Call Us: <span>+86 000 0000 0000</span></p>

                </div>
                <!-- Collect the nav links, forms, and other content for toggling -->

            </div>
            <div class="clearfix"> </div>
        </div>
    </nav>
</div>
<!-- //header -->

<!-- contact -->
<div class="contact">
    <div class="team-info w3-agileits">
        <div class="container">
            <div class="w3ls-title">
                <h3 class="agileits-title w3title1">Login</h3>
            </div>
            <div class="contact-form">
                <form action="#" method="post" name="login">
                    <label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ID:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                    <input type="text" id="id" name="id" placeholder="id" required="">
                    <br/>
                    <label>Password:</label>
                    <input type="password"  id="password" name="password" placeholder="password" required="">
                    <br/>
                    <select id="userType">
                        <option value="customer">Customer</option>
                        <option value="manager">Manager</option>
                    </select>
                    <br/>
                    <input id="btn_login" type="button" value="LOGIN" >
                    <br/><br/>
                </form>
                <a id ="goRegister" href="javascript:;">I don't hava an account>>></a>
            </div>
        </div>
    </div>
</div>
<!-- //contact -->

<!-- footer -->
<div class="footer">
    <div class="container">
        <div class="col-md-4 w3layouts_footer_grid">


        </div>
        <div class="col-md-8 w3layouts_footer_grid">

        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<!-- //footer -->

<script src="../../js/bootstrap.js"></script>
</body>
</html>