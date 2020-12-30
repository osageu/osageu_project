package com.osageu.programmers.level1;

import java.util.ArrayList;

public class 소수_찾기 {
	
	// 내 것 (근데 효율성 테스트는 미통과)
	public int solution(int n) {
        int answer = 2;
        
        if(n == 2) {
        	answer = 1;
        }else {
        	for(int i = 3 ; i <= n ; i+=2) { // i : 2~1000
        		int count = 0;
        		if(((i+1)%6==0 || (i-1)%6==0) && (Math.ceil(Math.sqrt(i)) - Math.sqrt(i)) != 0) {
        			for(int j = 3 ; j < Math.sqrt(i) ; j+=2) {
        				if(i%j == 0) {
        					count++;
        				}
        				if(count > 1) {
        					break;
        				}
        			}
        			if(count == 0) {
        				answer++;
        			}
        		}
        	}
        }
        
        return answer;
    }
	
	public int solution2(int n) {
		
		// n만큼 할당
		ArrayList<Boolean> primeList = new ArrayList<Boolean>(n+1); // 방은 1001개 index는 1000
		// 0번째와 1번째를 소수 아님으로 처리
		primeList.add(false);
		primeList.add(false);
		// 2~ n 까지 소수로 설정
		for(int i=2; i<=n; i++ ) {
			primeList.add(i, true);
		}
		
		// 2 부터  ~ i*i <= n
		// 각각의 배수들을 지워간다.
		for(int i=2; i<=Math.sqrt(n); i++){ // n = 1000
			if((primeList.get(i) && (i > 2 && i % 2 != 0)) || (primeList.get(i) && (i == 2))){ //i*i 미만은 이미 처리되었으므로 j의 시작값은 i*i로 최적화할 수 있다.
				for(int j = i*i; j<=n; j+=i) {
					primeList.set(j, false);
				}
				
			}
		}
		// i = 2, j = 4, 6, 8, ... , 1000
		// i = 3, j = 9, 12, 15, ... , 1000
		// i = 4, 
		int result = 0;
		if(n == 2) {
			result = 1;
		}else {
			for(int i = 0 ; i < n ; i++) {
				if(primeList.get(i)) {
					result++;
				}
			}
		}
		
		return result;
	}
	
	public int solution3(int n) {
		int answer = 0; 
		boolean[] sosu =new boolean [n+1]; 
		
		//2~n번째수를 true로 초기화 
		for(int i=2; i<=n ; i++) {
			sosu[i]=true; 
		}
		
		//제곱근 구하기 
		for(int i=2; i<=(int)Math.sqrt(n); i++){ //2~루트n까지 검사 
			if(sosu[i]){ //i번째의 수가 소수일 때 
				for(int j=i; i*j<=n; j++) //그 배수들을 다 false로 초기화(배수는 소수가 아니기 때문) 
					sosu[i*j]=false; 
			} 
		} 
		
		//소수의 개수 세기 
		for(int i =2; i<=n; i++) { 
			if(sosu[i]) {
				answer++; } 
		}
		
		return answer;
	}

	
}
