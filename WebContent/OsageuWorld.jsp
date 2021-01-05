<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String cp = request.getContextPath();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Osageu World</title>
</head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="shortcut icon" href="resources/game/hanzo.jpeg">
<style>
	body{
		background:black;
	}
	#wrap{
		width:900px;
		height:800px;
		border:3px solid lightgray;
		background:white;
		margin:auto;
		margin-top:50px;
	}
	#wrap div{
		border:1px solid gray
	}
	#header{
		height:20%;
		background:rgb(30,30,30);
		color:white;
		font-size:80px;
		text-align:center;
		line-height:2em;
	}
	
	
	
	#navi{
		height:5%;
	}
	
	
	
	#body{
		height:65%;
	}
	#body>div{
		margin:20px;
	}
	.sameStyle{
		background:lightgray;
		border:0px;
		padding:10px;
		font-size:22px;
		font-weight:bold;
		padding-left:14px;
		padding-top:13px;
		cursor:pointer;
	}
	.sameStyle label{
		cursor:pointer;
	}
	/* mine */
	#landMineSearch{
		width:100px;
	}
	#landMineSearch:hover{
		cursor:pointer;
	}
	#landMineSearch>label:hover{
		cursor:pointer;
	}
	.mineRed{
		color:red;
	}
	
	/* sameCard */
	#sameCardSearch{
		width:140px;
	}
	.cardBlue{
		color:blue;
	}
	.cardRed{
		color:red;
	}
	.cardGreen{
		color:green;
	}
	
	#footer{
		height:10%;
	}
	
	/* omok */
	#omok{
		width:80px;
		text-align:center;
	}
	
</style>
</head>
<body>
    <div id = "wrap">
    
    	<div id = "header">
    		Osageu World
    	</div>
    	
    	<div id = "navi">
    	
    	</div>
    	
    	<div id = "body">
    	
    		<div id = "landMineSearch" class="sameStyle">
    			<label>지</label>
    			<label class="mineRed">뢰</label>
    			<label>찾</label>
    			<label class="mineRed">기</label>
    		</div>
    		
    		<div id = "sameCardSearch" class="sameStyle">
    			<label class="cardBlue">같은</label>
    			<label class="cardRed">그림</label>
    			<label class="cardGreen">찾기</label>
    		</div>
    		
    		<div id = "omok" class="sameStyle">
    			<label>오</label>
    			<label style="color:white">목</label>
    		</div>
    		
    	</div>
    	
    	<div id = "footer">
    	
    	</div>
    	
    </div>
    <script>
    	$("#landMineSearch").click(function(){
    		location.href = "<%=cp%>/landMineSearch";
    	});
    	$("#sameCardSearch").click(function(){
    		location.href = "<%=cp%>/sameCardSearch";
    	});
    	$("#omok").click(function(){
    		location.href = "<%=cp%>/omok";
    	});
    </script>
</body>
</html>