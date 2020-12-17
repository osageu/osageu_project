package com.osageu.programmers.level1;

import java.util.ArrayList;

public class Flip {

	public int solution(int n) {
        int answer = 0;
        
        ArrayList<Integer> threejinbup = new ArrayList<>();
		int quotient = n;
		int remainder = 0;
		while(quotient >= 3) {
			quotient = n/3; // 1
			remainder = n%3; // 0
			threejinbup.add(remainder);
			n = quotient;
		}
		if(quotient > 0) {
			threejinbup.add(quotient);
		}
		int j = 0;
		for(int i = threejinbup.size()-1 ; i >= 0 ; i--) {
			answer += threejinbup.get(j)*(Math.pow(3, i));
			j++;
		}
        
        return answer;
    }
	
}
