package com.osageu.programmers.level2;

public class 일이사_나라의_숫자 {
	
	public String solution(int n) {
		 String answer = "";
		 StringBuilder sb = new StringBuilder();
		 int[] iArr = {4, 1, 2};
		 int remain = 0;
		 while(true) {
			 
			 if(n < 4) {
				 sb.append(iArr[n%3]);
				 break;
			 }else {
				 remain = n % 3;
				 sb.append(iArr[remain]);
				 n = n / 3;
				 if(remain == 0) {
					 n = n-1;
				 }
				 if(n < 3) {
					 sb.append(iArr[n]);
					 break;
				 }
			 }
			 
		 }
		 
		 answer = sb.reverse().toString();
	     return answer;
		
	}
	
	// 타인의 풀이
	public String solution1(int n) {
	     String[] num = {"4","1","2"};
	     String answer = "";
	
	     while(n > 0){
	         answer = num[n % 3] + answer;
	         n = (n - 1) / 3;
	     }
	     return answer;
	 }
	
	// 반 정도 통과한 코드
	public String solution2(int n) {
        String result = "";
        	
        String[] sArr = {"1", "2", "4"}; 
		String[] answer;
		
		// 자릿수(a) 구하기
		int a = 1;
		int input = 0;
		while(true) {
			input += Math.pow(3, a);
			if(input - Math.pow(3, a) <= n && n <= input) {
				break;
			}
			a++;
		}
		
		// 해당 자릿수의 시작값(b) 구하고 및 선언
		int b = 0;
		for(int i = 0 ; i < a ; i++) {
			b+=Math.pow(3, i);
		}
		answer = new String[a];
		for(int i = 0 ; i < a ; i++) {
			answer[i] = "1";
		}
		
		// 답(answer) 구하기
		int count = 1;
		while(true) {
			
			if(count == 1) {
				switch((n-b)%3) {
					case 0 : answer[a-count] = "1"; break;
					case 1 : answer[a-count] = "2"; break;
					case 2 : answer[a-count] = "4"; break;
				}
			}else {
				int start = n-b;
				while(true) {
					start = start/(int)(Math.pow(3, count-1));
					
					if(start%3 == 0) {
						start = 0;
						break;
					}else if(start < Math.pow(3, count-1) && start < 3) {
						break;
					}else if(start > 3 && start <Math.pow(3, count-1)) {
						while(true) {
							start = start - 3;
							if(start < 3) {
								break;
							}
						}
						break;
					}
				}
				answer[a-count] = sArr[start];
			}
			
			count++;
			if(count == a+1) {
				break;
			}
		}
        
		result = String.join("", answer);
		
        return result;
    }
}
