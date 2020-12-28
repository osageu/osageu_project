package com.osageu.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class Integer_descending_order {
	
	public long solution(long n) {
        long answer = 0;
        
        String str = n+"";
        String[] sArr = str.split("");
        Arrays.sort(sArr, Collections.reverseOrder());
        answer = Long.parseLong(String.join("", sArr));
        
        return answer;
    }
	
}
