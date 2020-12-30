package com.osageu.programmers.level1;

import java.util.ArrayList;

public class 같은_숫자는_싫어 {

	public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> filter = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++) {
        	if(i == 0) {
        		filter.add(arr[i]);
        	}else {
        		filter.add(arr[i]);
        		if(filter.get(filter.size()-2) == filter.get(filter.size()-1)) {
        			filter.remove(filter.size()-1);
        		}
        	}
        }
        
        answer = new int[filter.size()];
        for(int i = 0 ; i < answer.length ; i++) {
        	answer[i] = filter.get(i);
        }
        
        return answer;
    }
	
}
