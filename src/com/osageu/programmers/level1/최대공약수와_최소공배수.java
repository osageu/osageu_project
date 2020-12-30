package com.osageu.programmers.level1;

import java.util.ArrayList;

public class 최대공약수와_최소공배수 {
	 public int[] solution(int n, int m) {
	        int[] answer = new int[2];
	        
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        // 나눗셈 과정
	        int remainN = 0;
	        int remainM = 0;
	        for(int i = 2 ; i <= Math.min(n, m) ; i++) {
	        	remainN = n%i;
	        	remainM = m%i;
	        	if(remainN == 0 && remainM == 0) {
	        		list.add(i);
	        		n = n/i;
	        		m = m/i;
	        		i = 1;
	        	}
	        }
	        
	        // 최대공약수 구하기 
	        int LCM = 1;
	        if(list.isEmpty()) {
	        	answer[0] = 1;
	        }else {
	        	for(Integer a : list) {
	        		LCM *= a;
	        	}
	        	answer[0] = LCM;
	        }
	        
	        // 최소공배수 구하기
	        answer[1] = LCM*n*m;
	        
	        return answer;
	    }
}
