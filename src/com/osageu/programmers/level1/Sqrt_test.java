package com.osageu.programmers.level1;

public class Sqrt_test {
	public long solution(long n) {
        long answer = 0;
        
        if(Math.ceil(Math.sqrt(n)) - Math.sqrt(n) == 0) {
        	answer = (long)Math.pow(Math.sqrt(n)+1, 2);
        }else {
        	answer = -1;
        }
        
        return answer;
    }
}
