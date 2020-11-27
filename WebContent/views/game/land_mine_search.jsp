<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
	String cp = request.getContextPath();
	int[] mine = (int[])request.getAttribute("mine");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>지뢰찾기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style>
	#wrapMind{
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
        text-align:center;
        font-size:15px;
        font-weight:900;
        position:relative;
        width:21px;
        height:21px;
    }
    td div{
        border-right:2px solid black;
        border-bottom:2px solid black;
        border-top: 2px solid white;
        border-left: 2px solid white;
        width:16px;
        height:16px;
        background:lightgray;
    }
    table label{
    	position:absolute;
    	left:0;
    	top:2px;
    	right:0;
    	bottom:0;
    }
    .mineImage{
    	width:18px;
    	height:18px;
    	position:absolute;
    	top:2px;
    	left:2px;
    	right:0;
    	bottom:0;
    }
	.mineNumber{
    	display:none;
    }
    .hideMine{
    	display:none;
    }
    .showMine{
    	display:inline-block;
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
</style>
</head>
<body>
<div id = "wrapMind">
<h1 align="center">지뢰찾기</h1>	
	<div id = "timer">
		<input type="button" value="start" onclick="timer();">
		<div id="countdown">0</div>
	</div>
	
    <table border="1">
    	<tr>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	    </tr>
	    <tr>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	    </tr>
	    <tr>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	    </tr>
	    <tr>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	    </tr>
	    <tr>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	    </tr>
	    <tr>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	    </tr>
	    <tr>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	    </tr>
	    <tr>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	    </tr>
	    <tr>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	    </tr>
	    <tr>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	    </tr>
	    <tr>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	    </tr>
	    <tr>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	        <td>
	            <div></div>
	        </td>
	    </tr>
    </table>
</div>
    <script>
    	var gameEnd = 1;
		var clickCount = 1;
		var mineArray = [];
		
		// 타이머 만들기
    	var count = 0;
		var time = 0;
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
		}
		
    	$(function(){
    		
    		// 지뢰
   			var mine = "<img src='<%=cp%>/resources/game/mine.png' class='mineImage hideMine'>";
    		var flag = "<img src='<%=cp%>/resources/game/flag.png' style='width:15px; height:15px;'>";
   			
    		// 지뢰찾기 테이블에 우클릭 후 뜨는 메뉴 제거
    		$("table").bind("contextmenu", function(e) {
    		    return false;
   		    });
    		
    		// 좌클릭 시 div 제거, 우클릭 시 깃발 추가
    		$("td div").bind("mousedown", function( event ){
    			if( event.which == 1 ){
 					var tdNum = $(this).closest("td").prevAll().length;
 					var trNum = ($(this).closest("tr").prevAll().length)*8;
 					var eqNo = tdNum + trNum; // eq(i) --> i를 반환
 					
 					if(clickCount == 1){
 						
 						// 지뢰 심기
 			    		$.ajax({
 			    			url:"mine.no",
 							data:{eqNo:eqNo},
 							type:"get",
 							async:false,
 							success:function(result){	
 								mineArray = result[0];
 								console.log(mineArray);
		 						for(var i = 0 ; i < result[0].length ; i++){
		 								$("table td").eq(result[0][i]).append(mine);
		 			    		}
 							},
 							error:function(){					
 								console.log("ajax 실패");
 							},
 			    		});
 			    		
 			    		
 			    		// 숫자 만들기
 			  			for(var i = 0 ; i < 96 ; i++){
 			  				
 			  				var count = 0;
 			  				if(i%8!=0 && i!=88 && i!=0 && $("table td").eq(i-1).children("div").next().is("img")){
 			  					count++;
 			  				}
 			  				if(i>6 && i%8!=7 && i!=95 && i!=0 && i!=7 && $("table td").eq(i-7).children("div").next().is("img")){
 			  					count++;
 			  				}
 			  				if(i>6 && i!=0 && i!=7 && $("table td").eq(i-8).children("div").next().is("img")){
 			  					count++;
 			  				}
 			  				if(i>6 && i%8!=0 && i!=88 && i!=0 && i!=7 && $("table td").eq(i-9).children("div").next().is("img")){
 			  					count++;
 			  				}
 			  				if(i%8!=7 && i!=95 && i!=7 && $("table td").eq(i+1).children("div").next().is("img")){
 			  					count++;
 			  				}
 			  				if(i<89 && i%8!=0 && i!=870 && i!=95 && i!=0 && $("table td").eq(i+7).children("div").next().is("img")){
 			  					count++;
 			  				}
 			  				if(i<89 && i!=88 && i!=95 && $("table td").eq(i+8).children("div").next().is("img")){
 			  					count++;
 			  				}
 			  				if(i<89 && i%8!=7 && i!=88 && i!=95 && i!=7 && $("table td").eq(i+9).children("div").next().is("img")){
 			  					count++;
 			  				}
 			  				
 			  				if($("table td").eq(i).children("div").next().is("img")==false && count!=0){
 			  					$("table td").eq(i).append("<label class='mineNumber'>"+count+"</label>");
 			  				}else if($("table td").eq(i).children("div").next().is("img")==false && count == 0){
 			  					$("table td").eq(i).append("<label class='mineNumber'></label>");
 			  				}
 			  			}
 			    		
 			  			// 숫자에 색 입히기
 			  			$("table td label").each(function(){
 			  				if($(this).html()==1){
 			  					$(this).css("color","blue");
 			  				}else if($(this).html()==2){
 			  					$(this).css("color","green");
 			  				}else if($(this).html()==3){
 			  					$(this).css("color","red");
 			  				}else if($(this).html()==4){
 			  					$(this).css("color","purple");
 			  				}else if($(this).html()==5){
 			  					$(this).css("color","pink");
 			  				}
 			  			});
 						timer();
 						clickCount = 2;
 					}
 					
   					// 깃발 있으면 클릭 안 됨
    				if($(this).html()!=""){
						return false;
    				}
					
					// 지뢰 클릭 시 게임끝
    				if($(this).next().is("img")){
    					$(this).css("display","none");
    					$(this).next().removeClass("hideMine");
    					alert("Boom!!");
    					gameEnd = 2;
    				}
   					
    				// 여러 영역 제거
    				if($("td").eq(eqNo).children("div").next().html()!=""){ // 0이 아닌 경우
	    				$("td").eq(eqNo).children("div").css("display","none");
	    				$("td").eq(eqNo).children("div").next().removeClass("mineNumber");
					}else if($("td").eq(eqNo).children("div").next().html()==""){ // 0인 경우
						
						$("td").eq(eqNo).children("div").css("display","none");
						
						if(eqNo%8 == 0){
							if(!$("td").eq(eqNo+1).children("div").next().is("img")){
								$("td").eq(eqNo+1).children("div").css("display","none");
			    				$("td").eq(eqNo+1).children("div").next().removeClass("mineNumber");
							}
							for(var i = 8 ; i < 10 ; i++){
								if(eqNo+i > 0 && !$("td").eq(eqNo+i).children("div").next().is("img")){
									$("td").eq(eqNo+i).children("div").css("display","none");
				    				$("td").eq(eqNo+i).children("div").next().removeClass("mineNumber");
								}
							}
							for(var i = 7 ; i < 9 ; i++){
								if(eqNo-i >= 0 && !$("td").eq(eqNo-i).children("div").next().is("img")){
									$("td").eq(eqNo-i).children("div").css("display","none");
				    				$("td").eq(eqNo-i).children("div").next().removeClass("mineNumber");
								}
							}
						}else if(eqNo%8 == 7){
							if(!$("td").eq(eqNo-1).children("div").next().is("img")){
								$("td").eq(eqNo-1).children("div").css("display","none");
			    				$("td").eq(eqNo-1).children("div").next().removeClass("mineNumber");
							}
							for(var i = 8 ; i < 10 ; i++){
								if(eqNo-i > 0 && !$("td").eq(eqNo-i).children("div").next().is("img")){
									$("td").eq(eqNo-i).children("div").css("display","none");
				    				$("td").eq(eqNo-i).children("div").next().removeClass("mineNumber");
								}
							}
							for(var i = 7 ; i < 9 ; i++){
								if(eqNo-i > 0 && !$("td").eq(eqNo+i).children("div").next().is("img")){
									$("td").eq(eqNo+i).children("div").css("display","none");
				    				$("td").eq(eqNo+i).children("div").next().removeClass("mineNumber");
								}
							}
						}else{
							
							if(!$("td").eq(eqNo-1).children("div").next().is("img")){
								$("td").eq(eqNo-1).children("div").css("display","none");
				    			$("td").eq(eqNo-1).children("div").next().removeClass("mineNumber");
							}
			    			
							for(var i = 7 ; i < 10 ; i++){
								if(eqNo-i > 0 && !$("td").eq(eqNo-i).children("div").next().is("img")){
									$("td").eq(eqNo-i).children("div").css("display","none");
				    				$("td").eq(eqNo-i).children("div").next().removeClass("mineNumber");
								}
							}
							
							if(!$("td").eq(eqNo+1).children("div").next().is("img")){
								$("td").eq(eqNo+1).children("div").css("display","none");
				    			$("td").eq(eqNo+1).children("div").next().removeClass("mineNumber");
							}
							
							for(var i = 7 ; i < 10 ; i++){
								if(eqNo+i > 0 && !$("td").eq(eqNo+i).children("div").next().is("img")){
									$("td").eq(eqNo+i).children("div").css("display","none");
				    				$("td").eq(eqNo+i).children("div").next().removeClass("mineNumber");
								}
							}
						}
						
	    				
					} // 여러 영역 제거 end.
					
    				// 지뢰 제외 모든 영역 클릭 시 게임 끝
    				var endCount = 0;
    				for(var i = 0 ; i < 96 ; i++){
	    	    		if($("td").eq(i).children("div").css("display") == "none"){
	    	    			endCount++;
	    	    		}
    				}
    				if(endCount == 86){
    					alert("gameEnd");
    					gameEnd = 2;
    				}
					
    			}else if( event.which == 3 ){
    				
    				// 깃발 추가 및 제거
    				if($(this).html()==""){
	    				$(this).html(flag);
    				}else{
    					$(this).html("");
    				}
    				
    			}
    		});
    		
    		
    	}); // window.onload end
    	
		/* // (test) 클릭 시 모든 div 없애기
		$("table td").click(function(){
			$("table div").css("display","none");
		}); */
		
    </script>
</body>
</html>