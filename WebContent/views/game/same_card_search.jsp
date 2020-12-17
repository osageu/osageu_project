<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>같은 그림 찾기</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="shortcut icon" href="resources/game/hanzo.jpeg">
<style>
	#wrapCard{
		border:1px solid gray;
		padding-top:50px;
	}
	h1{
		font-size:40px;
	}
	
	table{
        border-collapse: collapse;
        margin:auto;
        margin-bottom:40px;
    }
	td{
        border:1px solid black;
        width:120px;
        height:120px;
        position:relative;
    }
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
	.flipper, .front>img{
		width:100%;
		height:100%;
	}
	.back:hover{
		cursor:pointer;
	}
	.front, .back{
		width:120px;
    	height:120px;
	}
	.front{
		z-index:1;
		position:absolute;
    	transform : rotateY(-90deg);
		transition: 0.4s;
	}
    .back{
    	z-index:2;
		position:absolute;
    	background:black;
		transition: 0.4s;
    }
</style>
</head>
<body>

	<div id="wrapCard">
	
		<h1 align="center">같은 그림 찾기</h1>
		
		<div style="width:490px; margin:auto;" align="right">
			<div id = "timer" align="left">
				<input type="button" value="start" onclick="timer();">
				<div id="countdown">0</div>
			</div>
		</div>
		
		<table border="1">
			<c:forEach var="tr" begin="1" end="4">
				<tr>
					<c:forEach var="td" begin="1" end="4">
						<td>
							<div class="flipper">
								<div class="front">
								
								</div>
								<div class="back">
									
								</div>
							</div>
						</td>
					</c:forEach>
				</tr>
			</c:forEach>
		</table>
		
	</div>
	<script>
	
		// 타이머 만들기
		var count = 0;
		var time = 0;
		var gameEnd = [];
		function timer() {
			clearInterval(time);
			time = setInterval("myTimer()",1000);
		}
		function myTimer() {
			if(count == 998 || gameEnd.length == 16){
				clearInterval(time);
				alert("게임 끝!! " + count + "초 걸렸네요~!");
			}else{
				count = count + 1;
				$("#countdown").html(count);
			}
		}
		
		$(function(){
			
			// 그림들 배치하기
			var pic = []; // 사진 배열 
			var num = []; // 랜덤 숫자 배열
			pic.push("${ pageContext.request.contextPath }/resources/game/haerang.jpeg");
			pic.push("${ pageContext.request.contextPath }/resources/game/haerang.jpeg");
			pic.push("${ pageContext.request.contextPath }/resources/game/kaori.jpeg");
			pic.push("${ pageContext.request.contextPath }/resources/game/kaori.jpeg");
			pic.push("${ pageContext.request.contextPath }/resources/game/rano.jpeg");
			pic.push("${ pageContext.request.contextPath }/resources/game/rano.jpeg");
			pic.push("${ pageContext.request.contextPath }/resources/game/simhakgyu.jpeg");
			pic.push("${ pageContext.request.contextPath }/resources/game/simhakgyu.jpeg");
			pic.push("${ pageContext.request.contextPath }/resources/game/tia.jpeg");
			pic.push("${ pageContext.request.contextPath }/resources/game/tia.jpeg");
			pic.push("${ pageContext.request.contextPath }/resources/game/lunyang.jpeg");
			pic.push("${ pageContext.request.contextPath }/resources/game/lunyang.jpeg");
			pic.push("${ pageContext.request.contextPath }/resources/game/kineus.jpeg");
			pic.push("${ pageContext.request.contextPath }/resources/game/kineus.jpeg");
			pic.push("${ pageContext.request.contextPath }/resources/game/hanzo.jpeg");
			pic.push("${ pageContext.request.contextPath }/resources/game/hanzo.jpeg");
			
			<c:forEach var="i" items="${card}">
				num.push(${card[i]});
			</c:forEach>
			
			for(var i = 0 ; i < 16 ; i++){
				$(".front").eq(num[i]).append("<img src='" + pic[i] + "'>");
				$(".front").eq(i).attr("id",i);
			}
			
		})
		
		// 그림 클릭 시 front <-> back 전환
		var start = 0;
		var yn = 1; // 클릭 횟수 
		var confirm = []; // 뒤집힌 카드 두 개가 같은지 확인용 
		var clickNum = []; // 뒤집한 카드 두 개의 위치(eq)
		$(".back").click(function(){
			
			console.log(yn);
			console.log(confirm);
			console.log(clickNum);
			// 타이머 시작
			if(start == 0){
				timer();
				start = 1;
			}
			
			// 첫 번째 카드 뒤집기
			if(yn == 1){
				
				// 배열 채우기
				confirm.push($(this).siblings().html());
				clickNum.push($(this).siblings().attr("id"));
				
				// front <-> back
				$(this).css("transform","rotateY(90deg)");
				setTimeout(function() {
					
					$(".front").eq(clickNum[0]).css("transform","rotateY(0deg)");
					
				}, 400);
				yn++;
				
			// 두 번째 카드 뒤집기
			}else if(yn == 2){
				
				// 배열 채우기
				confirm.push($(this).siblings().html());
				clickNum.push($(this).siblings().attr("id"));
				
				// front <-> back
				$(this).css("transform","rotateY(90deg)");
				setTimeout(function() {
					
					$(".front").eq(clickNum[1]).css("transform","rotateY(0deg)");
					
				}, 400);
				yn++;
				
				// 두 개의 카드가 같은 지 확인 중에 다른 back 클릭 못 하게 하기
				$(".back").not($(".back").eq(clickNum[0])).not($(".back").eq(clickNum[1])).css("pointer-events", "none");
				
			}
			
			if(yn == 3){
				if(confirm[0] != confirm[1]){
					
					// 1초간 카드 확인 후 원상복귀
					setTimeout(function() {
						
						$(".front").eq(clickNum[0]).css("transform","rotateY(-90deg)");
						$(".front").eq(clickNum[0]).parent().css("pointer-events", "");
						$(".back").eq(clickNum[0]).css("transform","rotateY(0deg)");
						$(".front").eq(clickNum[1]).css("transform","rotateY(-90deg)");
						$(".front").eq(clickNum[1]).parent().css("pointer-events", "");
						$(".back").eq(clickNum[1]).css("transform","rotateY(0deg)");
						$(".back").not($(".back").eq(clickNum[0])).not($(".back").eq(clickNum[1])).css("pointer-events", "");
						yn = 1;
						confirm = [];
						clickNum = [];
						
					}, 1000);
				}else{
					
					// 같은 카드니까 그대로 유지
					$(".front").eq(clickNum[0]).css("transform","rotateY(0deg)");
					$(".front").eq(clickNum[1]).css("transform","rotateY(0deg)");
					$(".back").not($(".back").eq(clickNum[0])).not($(".back").eq(clickNum[1])).css("pointer-events", "");
					yn = 1;
					confirm = [];
					clickNum = [];
					gameEnd.push("a");
					gameEnd.push("b");
				}
			}
			
		})
		
	</script>
</body>
</html>