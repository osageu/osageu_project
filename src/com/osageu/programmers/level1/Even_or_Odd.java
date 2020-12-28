package com.osageu.programmers.level1;

public class Even_or_Odd {
	public String solution(int num) {
        String answer = "";
        
        answer = num%2 == 0 ? "Even" : "Odd";
        
        return answer;
    }
}
