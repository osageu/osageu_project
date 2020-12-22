package com.osageu.programmers.level1;

public class String_handle_basic {

	public boolean solution(String s) {
		boolean answer = true;
		if(s.length()!=4 && s.length()!=6) {
			answer = false;
			return answer;
		}else {
			for(int i = 0 ; i < s.length() ; i++) {
				if(s.charAt(i) >=58 || s.charAt(i) <=47) {
					answer = false;
					return answer;
				}
			}
			return answer;
		}
    }
	
	// 다른 사람 풀이 --> 문자열 그 자체를 int로 바꿔서 바뀌면 다 숫자라는 걸 이용함.. ㄷㄷ
	public boolean solution2(String s) {
	      if(s.length() == 4 || s.length() == 6){
	          try{
	              int x = Integer.parseInt(s);
	              return true;
	          } catch(NumberFormatException e){
	              return false;
	          }
	      }
	      else return false;
	  }
	
}
