package com.osageu.programmers.level1;

public class Sum_digits {

	public int solution(int n) {
        int answer = 0;

        String str = n+"";
        String[] split = str.split(""); // "1", "2", "3"
        for(int i = 0 ; i < split.length ; i++) {
        	int a = Integer.parseInt(split[i]);
        	answer += a;
        }
        
        return answer;
    }
	
}
