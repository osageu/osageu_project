package com.osageu.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class 두_개_뽑아서_더하기 {
	
    public int[] solution(int[] numbers) { // numbers = { 2, 1, 3, 4, 1 } 4 3 2 1
    	
    	int[] answer = {};
    	
    	// 1. 값 더해서 중복제거를 위해 Hashset에 저장 
    	HashSet<Integer> hs = new HashSet<>();
    	for(int i = 0 ; i < numbers.length-1 ; i++) { // 01 02 03 04 12 13 14 23 24 34
    		for(int j = i+1 ; j < numbers.length ; j++) { // 
    			hs.add(numbers[i] + numbers[j]);
    		}
    	}
    	
    	// 2. 오름차순 정렬을 위해 HashSet to ArrayList
    	ArrayList<Integer> list = new ArrayList<Integer>(hs);
    	
    	// 3. ArrayList sort
    	Collections.sort(list);
    	
    	// 4. ArrayList to int array
    	answer = new int[list.size()];
    	for(int i = 0 ; i < list.size() ; i++) {
    		answer[i] = list.get(i);
    	}
    	
        return answer;
        
    }
    
}
