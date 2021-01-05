package com.osageu.programmers.level2;

public class 멀쩡한_사각형 {
	public long solution(long w, long h) {
        long answer = 1;
        long mul = w*h;
        
        if(w == h) {
        	// 정사각형
        	answer = w*h-w;
        }else {
        	// 직사각형
        	long min = Math.min(w, h);
        	long mid = 1;
        	while(true) {
        		
        		if(w%min == 0 && h%min == 0) {
        			w = w / min;
        			h = h / min;
        			mid *= min;
        			min = Math.min(w, h);
        		}else {
        			min--;
        		}
        		
        		if(min == 1) {
        			break;
        		}
        		
        	}
        	answer = mul - (w+h-1)*mid;
        }
        
        return answer;
    }
}
