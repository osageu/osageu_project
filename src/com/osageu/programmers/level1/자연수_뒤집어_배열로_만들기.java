package com.osageu.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class 자연수_뒤집어_배열로_만들기 {
	
	public int[] solution(long n) {
        int[] answer = {};
        
        String str = n+"";
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0 ; i < str.length() ; i++) {
        	list.add((str.charAt(i)+""));
        }
        
        Collections.reverse(list);
        
        answer = new int[list.size()];
        for(int i = 0 ; i < list.size() ; i++) {
        	answer[i] = Integer.parseInt(list.get(i));
        }
        
        return answer;
    }
	
}
