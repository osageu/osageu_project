package com.osageu.programmers.level1;

public class 이상한_문자_만들기 {

	public String solution(String s) {
        String answer = "";
        
        int rtrim = s.length()-s.replaceAll("\\s+$","").length();
        
        String[] sArr = s.split(" ");
		StringBuilder sum = new StringBuilder();
		
		for(int i = 0 ; i < sArr.length ; i++) {
			StringBuilder sb = new StringBuilder(sArr[i]);
			for(int j = 0 ; j < sArr[i].length() ; j++) {
				if(j % 2 == 0 && sb.charAt(j) >= 97 && sb.charAt(j) <= 122) {
					sb.setCharAt(j, (char)(sb.charAt(j)-32));
				}else if(j % 2 == 1 && sb.charAt(j) >= 65 && sb.charAt(j) <= 90) {
					sb.setCharAt(j, (char)(sb.charAt(j)+32));
				}
			}
			if(sb.length()!=0 && i!=sArr.length-1) {
				sum.append(sb);
				sum.append(" ");
			}else if(sb.length()!=0 && i==sArr.length-1){
				sum.append(sb);
			}else {
				sum.append(" ");
			}
		}
		for(int i = 0 ; i < rtrim ; i++) {
			sum.append(" ");
		}
        answer = sum.toString();
        return answer;
    }
	
	// 다른 사람 풀이
	public String solution2(String s) {

        String answer = "";
        int cnt = 0;
        String[] array = s.split("");
        for(String ss : array) {
            cnt = ss.contains(" ") ? 0 : cnt + 1;
            answer += cnt%2 == 0 ? ss.toLowerCase() : ss.toUpperCase(); 
        }
      return answer;
  }
	
}
