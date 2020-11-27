<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>같은 그림 찾기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style>
	#wrapCard{
		width:900px;
		height:900px;
		border:3px solid gray;
		padding-top:50px;
	}
	h1{
		font-size:40px;
	}
	
	table{
        border-collapse: collapse;
        margin:auto;
    }
	td{
        border:1px solid black;
        position:relative;
        width:120px;
        height:160px;
    }
	/* timer */
	#timer{
    	margin-left:675px;
    	margin-bottom:20px;
    	border:2px solid rgb(90,90,90);
    	border-radius:5px;
    	width:120px;
    	height:33px;
    	font-size:20px;
    }
    #timer input{
    	font-size:20px;
    	border:0px;
    	background:rgb(90,90,90);
    	color:white;
    	width:70px;
    	height:35px;
    	margin-top:-1px;
    	outline:none;
    	letter-spacing:3px;
    }
    #timer input:hover{
    	cursor:pointer;
    }
    #countdown{
    	display:inline-block;
    }
    
    /* entire container, keeps perspective */
	.flip-container {
	perspective: 1000px;
	}
	
	/* front pane, placed above back */
	.front{
	  z-index:2;
	  /* for firefox 31 */
	  transform: rotateY(0deg);
	}
	/* back, initially hidden pane */
	.back {
	transform: rotateY(180deg);
	}
	
	.flip-container, .front, .back {
	width: 300px;
	height: 500px;
	
	}
	/* flip speed goes here */
	.flipper {
	transition: 1.0s;
	   /* 하위요소에 3D 좌표값 지정 */
	transform-style: preserve-3d;
	position: relative;
	}
	/* hide back of pane during swap */
	.front, .back{
	  position: absolute;
	  backface-visibility:hidden;
	}
    
</style>
</head>
<body>

	<div id="wrapCard">
	
		<h1 align="center">같은 그림 찾기</h1>
		
		<div id = "timer">
			<input type="button" value="start" onclick="timer();">
			<div id="countdown">0</div>
		</div>
		
		<div class="flip-container">
			<div class="flipper">
				<div class="front">
				<!-- front content -->
				        front
				        <img src="${ pageContext.request.contextPath }/resources/game/haerang.jpeg">
				</div>
				<div class="back">
				<!-- back content -->
				        back
				        <img src="${ pageContext.request.contextPath }/resources/game/kaori.jpeg">
				</div>
			</div>
		</div>
		
		<script>
			$(".flip-container").click(function(){
				$(this).css("transform","rotateY(180deg)");
			})
		</script>
		
		<table border="1">
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</table>
		
	</div>
	<script>
		// 타이머 만들기
		var count = 0;
		var time = 0;
		var gameEnd = 1;
		function timer() {
			clearInterval(time);
			time = setInterval("myTimer()",1000);
		}
		function myTimer() {
			if(count == 998 || gameEnd == 2){
				clearInterval(time);
			}
			count = count + 1;
			$("#countdown").html(count);
			console.log(gameEnd);
		}
	</script>
</body>
</html>