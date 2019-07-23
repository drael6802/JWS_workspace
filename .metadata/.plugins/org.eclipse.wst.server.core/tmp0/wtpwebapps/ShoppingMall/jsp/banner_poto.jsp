<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<title>부트 이미지 슬라이더</title>
	<link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" rel="stylesheet" />
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
	<script src="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
</head>
<body>
<div style="width: 100%; height: 500px; display: inline-block;" >
	<div id="myCarousel" class="carousel slide" data-ride="carousel"> 
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>
		</ol>
		<div class="carousel-inner">
			<div class="item active"> 
				<img src="../img/case01.jpg" style="height: 500px; width: 100%; " alt="First slide">
				<div class="container">
					<div class="carousel-caption">
						<h1>1</h1>
						<p>1</p>
					</div>
				</div>
			</div>
			<div class="item"> 
				<img src="../img/galaxy_Buds2.jpg" style="height: 500px; width: 100%;" data-src="" alt="Second slide">
				<div class="container">
					<div class="carousel-caption">
						<h1> 2</h1>
						<p> 2</p>
					</div>
				</div>
			</div>
			<div class="item"> 
				<img src="../img/galaxy_Buds.jpg" style="height: 500px; width: 100%;" data-src="" alt="Third slide">
				<div class="container">
					<div class="carousel-caption">
						<h1> 3</h1>
						<p> 3</p>
					</div>
				</div>
			</div>
			<div class="item">
				<iframe style="margin: 0; padding: 0" width="100%" height="500px" src="https://www.youtube.com/embed/MxvWsfZGWfQ" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
				<div class="container">
					<div class="carousel-caption">
						<h1> 4</h1>
						<p> 4</p>
					</div>
				</div>
			</div>
		</div>
		<!--이전, 다음 버튼-->
		<a class="left carousel-control " href="#myCarousel" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> 
		<a class="right carousel-control " href="#myCarousel" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a> 	
		</div>
</div>
<div >

</div>
</body>
</html>