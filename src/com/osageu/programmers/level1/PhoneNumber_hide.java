package com.osageu.programmers.level1;

public class PhoneNumber_hide {
	
	public String solution(String phone_number) {
        String answer = "";
        
        String[] sArr = phone_number.split("");
        for(int i = 0 ; i < phone_number.length()-4 ; i++) {
        	sArr[i] = "*";
        }
        answer = String.join("", sArr);
        
        return answer;
    }
	
}
