package com.osageu.programmers.level1;

public class 시저_암호 {

	public String solution(String s, int n) {
		String answer = "";
        StringBuilder sb = new StringBuilder();
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i)==32) { // 공백 
				sb.append(s.charAt(i));
			}else if(s.charAt(i) >= 65 && s.charAt(i) <= 90) { // 대문자
				if(s.charAt(i)+n <= 90) {
					sb.append((char)(s.charAt(i)+n));
				}else {
					sb.append((char)(s.charAt(i)+n-26));
				}
			}else { // 소문자
				if(s.charAt(i)+n <= 122) {
					sb.append((char)(s.charAt(i)+n));
				}else {
					sb.append((char)(s.charAt(i)+n-26));
				}
				
			}
		}
        answer = sb.toString();
        return answer;
    }
	
}
