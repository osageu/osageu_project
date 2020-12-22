package com.osageu.programmers.level1;

public class Dot_product {

	public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i = 0 ; i < a.length ; i++) {
        	 answer += a[i]*b[i];
        }
        
        return answer;
    }
	
}
