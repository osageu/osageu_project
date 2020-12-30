package com.osageu.programmers.level1;

public class 다트_게임 {
	public int solution(String dartResult) {
        int answer = 0;
        
        // 1. 각 회차 항목 선언
        String first = "";
        int firstBonus = 0;
        char firstOption = 0;
        
        String second = "";
        int secondBonus = 0;
        char secondOption = 0;
        
        String third = "";
        int thirdBonus = 0;
        char thirdOption = 0;
        
        // 2. 각 회차 점수 추출
        int index = 0;
        int jump = 0;
        while(true) {
        	
        	if(Character.isDigit(dartResult.charAt(index))) { // 점수일 때
	        	switch(jump) {
	        		case 0 : first += dartResult.charAt(index); break;
	        		case 1 : second += dartResult.charAt(index); break;
	        		case 2 : third += dartResult.charAt(index); break;
	        	}
        	}else if(dartResult.charAt(index) != '*' && dartResult.charAt(index) != '#') { // 보너스일 때 
        		switch(jump) {
	        		case 0 : 
		        			switch(dartResult.charAt(index)) {
			        			case 83 : firstBonus = 1; break;
			        			case 68 : firstBonus = 2; break;
			        			case 84 : firstBonus = 3; break;
		        			}
	        		case 1 : 
		        			switch(dartResult.charAt(index)) {
			        			case 83 : secondBonus = 1; break;
			        			case 68 : secondBonus = 2; break;
			        			case 84 : secondBonus = 3; break;
		        			}
	        		case 2 : 
		        			switch(dartResult.charAt(index)) {
			        			case 83 : thirdBonus = 1; break;
			        			case 68 : thirdBonus = 2; break;
			        			case 84 : thirdBonus = 3; break;
		        			}
	        	}
        		jump++;
        	}else {
        		switch(jump) { // 옵션일 때
	        		case 1 : firstOption = dartResult.charAt(index); break;
	        		case 2 : secondOption = dartResult.charAt(index); break;
	        		case 3 : thirdOption = dartResult.charAt(index); break;
	        	}
        	}
        	
        	if(index == dartResult.length()-1) {
        		break;
        	}else {
        		index++;
        	}
        	
        }
        
        // 3. 점수, 보너스, 옵션에 맞게 계산
        int fPow = (int)Math.pow(Integer.parseInt(first), firstBonus);
        int sPow = (int)Math.pow(Integer.parseInt(second), secondBonus);
        int tPow = (int)Math.pow(Integer.parseInt(third), thirdBonus);
        
        switch(firstOption) {
	        case '*' : fPow = fPow * 2; break;
	        case '#' : fPow = fPow * (-1); break;
        }
        
        switch(secondOption) {
	        case '*' : fPow = fPow * 2;
	        		   sPow = sPow * 2;
	        		   break;
	        case '#' : sPow = sPow * (-1); break;
        }
        
        switch(thirdOption) {
	        case '*' : sPow = sPow * 2;
	    			   tPow = tPow * 2; 
	    			   break;
	        case '#' : tPow = tPow * (-1); break;
        }
        
        answer = fPow + sPow + tPow;
        
        return answer;
    }
}
