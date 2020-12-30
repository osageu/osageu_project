package com.osageu.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {

	public String solution(String s) {
        String answer = "";
        
        ArrayList<Character> small = new ArrayList<>();
		ArrayList<Character> big = new ArrayList<>();
		
		for(int i = 0 ; i < s.length() ; i++) {
			if(s.charAt(i) >= 97) {
				small.add(s.charAt(i));
			}else {
				big.add(s.charAt(i));
			}
		}
		
		Collections.sort(small, Collections.reverseOrder());
		Collections.sort(big, Collections.reverseOrder());
		
		small.addAll(big);
		
		for(int i = 0 ; i < small.size() ; i++) {
			answer+=small.get(i);
		}
        
        return answer;
    }
	
}
