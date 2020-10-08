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
	#landMineSearch{
		background:lightgray;
		border:0px;
		padding:10px;
		font-size:22px;
		font-weight:bold;
		width:100px;
		padding-left:14px;
		padding-top:13px;
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
	
	#footer{
		height:10%;
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
    		<div id = "landMineSearch">
    			<label>지</label>
    			<label class="mineRed">뢰</label>
    			<label >찾</label>
    			<label class="mineRed">기</label>
    		</div>
    	</div>
    	
    	<div id = "footer">
    	
    	</div>
    	
    </div>
    <script>
    	$("#landMineSearch").click(function(){
    		location.href = "<%=cp%>/LandMineSearch";
    	});
    </script>
</body>
</html>