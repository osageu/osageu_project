package com.osageu.programmers.level1;

import java.util.Arrays;

public class 예산 {
	public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        
        int limit = 0;
        for(int i = 0 ; i < d.length ; i++) {
        	limit += d[i];
        	answer++;
        	if(limit > budget) {
        		answer--;
        		break;
        	}else if(limit == budget) {
        		break;
        	}
        }
        
        return answer;
    }
}
