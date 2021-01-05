<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오목</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="shortcut icon" href="resources/game/hanzo.jpeg">
</head>
<style>
	/* timer */
	#timer{
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
</style>
<body>
	<div id="wrapCard">
	
		<h1 align="center">오목</h1>
		
		<div style="width:490px; margin:auto;" align="right">
			<div id = "timer" align="left">
				<input type="button" value="start" onclick="timer();">
				<div id="countdown">0</div>
			</div>
		</div>
		
	</div>
</body>
</html>