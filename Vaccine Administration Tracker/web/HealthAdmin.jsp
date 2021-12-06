<%-- 
    Document   : HealthAdmin
    Created on : Dec 1, 2021, 4:39:38 PM
    Author     : BIGLINKS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Health admin</title>
        <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;600&display=swap" rel="stylesheet">
	<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css" rel="stylesheet">
        <style>
                            body {
                        margin: 0;
                        padding: 0;
                        font-family: 'Montserrat', sans-serif;
                        background: #e3e9f7;
                }
                nav ul {
                        margin: 0;
                        padding: 0;
                        height: 100%;
                        width: 260px;
                        position: fixed;
                        top: 0;
                        left: 0;
                        background-color: #262626;
                }
                nav ul li {
                        list-style: none;
                }
                nav ul li a {
                        display: block;
                        font-family: 'Montserrat', sans-serif;
                        text-decoration: none;
                        text-transform: uppercase;
                        font-size: 20px;
                        color: #fff;
                        position: relative;
                        padding: 25px 0 25px 38px;
                }
                nav ul li a:before {
                        content: '';
                        position: absolute;
                        top: 0px;
                        right: 0px;
                        width: 0%;
                        height: 100%;
                        background: #e3e9f7;
                        border-radius: 40px 0px 0px 40px;
                        z-index: -1;
                        transition: all 300ms ease-in-out;
                }
                nav ul li a:hover {
                        color: #2b2626;
                }
                nav ul li a:hover:before {
                        width: 95%;
                }
                .wrapper {
                        margin-left: 260px;
                }
                .section {
                        display: grid;
                        place-items: center;
                        min-height: 100vh;
                        text-align: center;
                }
                .box-area h2 {
                        text-transform: uppercase;
                        font-size: 50px;
                }
                .box-area p {
                        line-height: 2;
                }
                .box-area {
                        width: 75%;
                }
                .logo {
                        width: 150px;
                        height: 150px;
                        border-radius: 50%;
                        overflow: hidden;
                        margin: 25px auto;
                }
                .logo img {
                        width: 100%;
                }

        </style>
    </head>
    <body>
        <nav>
		<ul>
			<li class="logo"><img alt="" src="https://i.postimg.cc/WzkCM20g/logo1.png"></li>
			<li>
				<a href="#"><i class="fa fa-home"></i>   home</a>
			</li>
			<li>
				<a href="#"><i class="fa fa-book"></i>   about</a>
			</li>
			<li>
				<a href="#"><i class="fa fa-users"></i>   Team</a>
			</li>
			<li>
				<a href="#"><i class="fa fa-picture-o"></i>   portfolio</a>
			</li>
			<li>
				<a href="#"><i class="fa fa-phone"></i>   contact</a>
			</li>
		</ul>
	</nav>
	<div class="wrapper">
		<div class="section">
			<div class="box-area">
				<h2 style="color: #2b2626">Homepage</h2>
			</div>
		</div>
	</div>
    </body>
</html>
