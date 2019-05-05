<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@include file="/WEB-INF/base.jsp" %>
<!-- 准许获取session的值-->
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Account</title>
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
    <script type="text/javascript" src="../../js/systemJS/caccount.js"></script>
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
                <div class="collapse navbar-collapse navbar-right" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav navbar-left cl-effect-14">
                        <li><a id="home_bar" href="javascript:;">Home</a></li>
                        <li><a id="account_bar" href="javascript:;" class="active">account</a></li>
                        <li><a id="catagory_bar" href="javascript:;">catagory</a></li>
                        <li><a id="order_bar" href="javascript:;">order</a></li>
                        <li><a id="logout_bar" href="javascript:;">logout</a></li>
                    </ul>
                    <div class="clearfix"> </div>
                </div><!-- //navigation -->
            </div>
            <div class="clearfix"> </div>
        </div>
    </nav>
</div>
<!-- //header -->
<div class="container">
    <div class="grid_3 grid_4 w3layouts">
        <h3 class="hdg">Infomation</h3>
        <div class="bs-example">
            <table class="table">
                <tbody>
                <tr>
                    <td><h2 id="id">ID:${currCustomer.customerid}<a class="anchorjs-link" href="#h2.-bootstrap-heading"><span class="anchorjs-icon"></span></a></h2></td>
                </tr>
                <tr>
                    <td><h2 id="name">Name:${currCustomer.customername}<a class="anchorjs-link" href="#h2.-bootstrap-heading"><span class="anchorjs-icon"></span></a></h2></td>
                </tr>
                <tr>
                    <td><h2 id="phone">Phone:${currCustomer.phone}<a class="anchorjs-link" href="#h2.-bootstrap-heading"><span class="anchorjs-icon"></span></a></h2></td>
                </tr>
                <tr>
                    <td><h2 id="address">Address:${currCustomer.address}<a class="anchorjs-link" href="#h2.-bootstrap-heading"><span class="anchorjs-icon"></span></a></h2></td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>

<br/><br/><br/><br/><br/>
<!-- modal-sign -->
<div class="modal bnr-modal fade" id="myModal" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
            </div>
            <div class="modal-body modal-spa">
                <img class="img-responsive" src="../../images/g1.jpg" alt="">
            </div>
        </div>
    </div>
</div>








<!-- footer -->
<div class="footer">
    <div class="container">

        <div class="col-md-8 w3layouts_footer_grid">
            <ul class="w3l_footer_nav">
                <li><a id="home_foot" href="javascript:;">Home</a></li>
                <li><a id="account_foot" href="javascript:;">acoount</a></li>
                <li><a id="catagory_foot" href="javascript:;">catagory</a></li>
                <li><a id="order_foot" href="javascript:;">order</a></li>
            </ul>
        </div>
        <div class="clearfix"> </div>
    </div>
</div>
<!-- //footer -->
<!-- banner Slider starts Here -->
<script src="../../js/responsiveslides.min.js"></script>
<!-- //End-slider-script -->
<script src="../../js/bootstrap.js"></script>
</body>
</html>