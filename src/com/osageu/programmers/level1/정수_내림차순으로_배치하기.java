package com.osageu.programmers.level1;

import java.util.Arrays;
import java.util.Collections;

public class 정수_내림차순으로_배치하기 {
	
	public long solution(long n) {
        long answer = 0;
        
        String str = n+"";
        String[] sArr = str.split("");
        Arrays.sort(sArr, Collections.reverseOrder());
        answer = Long.parseLong(String.join("", sArr));
        
        return answer;
    }
	
}
