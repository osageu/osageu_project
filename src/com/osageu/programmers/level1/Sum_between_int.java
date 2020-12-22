package com.osageu.programmers.level1;

public class Sum_between_int {

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
