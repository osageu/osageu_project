package com.osageu.programmers.level1;

public class 두_정수_사이의_합 {

	public long solution(int a, int b) {
        long answer = 0;
        
        if(a == b) {
        	answer = a;
        }else if(a > b){
        	
        	while(a >= b) {
        		answer += b;
        		b++;
        	}
        	
        }else if(a < b) {
        	
        	while(a <= b) {
        		answer += a;
        		a++;
        	}
        	
        }
        
        return answer;
    }
	
}
