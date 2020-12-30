package com.osageu.programmers.level1;

public class 콜라츠_추측 {
	public long solution(long num) {
		long answer = 0;
        
        if(num == 1) {
        	return 0;
        }
        
        while(true) {
        	if(num%2 == 0) {
        		num = num/2;
        		answer++;
        	}else {
        		num = (num*3)+1;
        		answer++;
        	}
        	if(num == 1 || answer == 500) {
        		break;
        	}
        }
        
        answer = answer == 500 ? -1 : answer;
        
        return answer;
    }
}
