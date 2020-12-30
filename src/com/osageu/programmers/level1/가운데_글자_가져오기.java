package com.osageu.programmers.level1;

public class 가운데_글자_가져오기 {
	public String solution(String str) {
		String answer = "";
		if (str.length() % 2 == 0) {
			char char1 = str.charAt(str.length()/2-1);
			char char2 = str.charAt(str.length()/2);
			String str1 = String.valueOf(char1);
			String str2 = String.valueOf(char2);
			answer = str1 + str2;
		}else {
			answer = String.valueOf(str.charAt(str.length()/2));
		}
		return answer;
	}
}
