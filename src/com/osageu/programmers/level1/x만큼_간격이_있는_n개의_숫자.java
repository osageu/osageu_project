package com.osageu.programmers.level1;

public class x만큼_간격이_있는_n개의_숫자 {
	public long[] solution(long x, int n) {
        long[] answer = new long[n];
        long inc = x;
        
        for(int i = 0 ; i < n ; i++) {
        	answer[i] = x;
        	x = x+inc;
        }
        	
        return answer;
    }
}
