package com.osageu.programmers.level1;

import java.util.ArrayList;

public class 약수의_합 {

	public int solution(int n) {
        int answer = 0;
        
        ArrayList<Integer> divisors = new ArrayList<>();
		for(int i = 1 ; i < n ; i++) {
			if(n%i == 0) {
				divisors.add(i);
			}
		}
		divisors.add(n);
		for(int i = 0 ; i < divisors.size() ; i++) {
			answer += divisors.get(i);
		}
        
        return answer;
    }
	
}
