package com.osageu.programmers.level1;

import java.util.Arrays;

public class 하샤드_수 {
	public boolean solution(int x) {
        boolean answer = true;
        String[] sArr = (x+"").split("");
        int[] iArr = Arrays.stream(sArr).mapToInt(Integer::parseInt).toArray();
        int sum = 0;
        for(int a : iArr) {
        	sum += a;
        }
        
        if(x%sum == 0)
        	answer = true;
        else
        	answer = false;
        
        return answer;
    }
}
