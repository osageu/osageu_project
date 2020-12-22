package com.osageu.programmers.level1;

public class StringToInt {
	
	public int solution(String s) { // "+1234"
        int answer = 0;
        
        if(s.charAt(0) >= 49 && s.charAt(0) <= 57) {
        	answer = Integer.parseInt(s);
        }else if(s.charAt(0)=='+') {
        	answer = Integer.parseInt(s.substring(1, s.length()));
        }else {
        	answer = 0-Integer.parseInt(s.substring(1, s.length()));
        }
        
        return answer;
    }
	
}
