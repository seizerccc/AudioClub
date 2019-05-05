<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@include file="/WEB-INF/base.jsp" %>
<!-- 准许获取session的值-->
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Register</title>
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
    <script type="text/javascript" src="../../js/systemJS/register.js"></script>
    <script type="text/javascript" src="../../js/systemJS/links.js"></script>
</head>

<body>
<!-- header -->
<div class="header">
    <nav class="navbar navbar-default">
        <div class="container">
            <div class="navbar-header navbar-left wthree">
                <h1><a href="#">Audio<span>AudioClub</span></a></h1>
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
                <h3 class="agileits-title w3title1">Register</h3>
            </div>
            <div class="contact-form">
                <form action="#" method="post">
                    <label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Name:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
                    <input id="name" type="text" name="Name" placeholder="set your id(pure number)" required="">
                    <br/>
                    <label>Password:</label>
                    <input id="password" type="password"  name="Email" placeholder="set your password" required="">
                    <br/>
                    <label>Phone:</label>
                    <input id="phone" type="text"  name="phone" placeholder="your phone" required="">
                    <br/>
                    <label>Address:</label>
                    <input id="address" type="text"  name="address" placeholder="your address" required="">
                    <br/>
                    <br/>
                    <input  id="btn_register" type="button" value="REGISTER" >

                </form>
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