package com.osageu.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class Smallest_number_remove {
	 public int[] solution(int[] arr) {
	        int[] answer = {};
	        
        	// 1. array to list
        	ArrayList<Integer> list = new ArrayList<>();
        	for(int a : arr) {
        		list.add(a);
        	}
        	
        	// 2. remove smallest number
        	int smallest = Collections.min(list);
        	for(int i = 0 ; i < list.size() ; i++) {
        		if(list.get(i) == smallest) {
        			list.remove(i);
        			i--;
        		}
        	}
        	
        	// 3. list to array
        	if(list.isEmpty()) {
        		answer = new int[1];
        		answer[0] = -1;
        	}else {
        		answer = new int[list.size()];
        		for(int i = 0 ; i < list.size() ; i++) {
        			answer[i] = list.get(i);
        		}
        	}
        	
	        return answer;
	    }
}
