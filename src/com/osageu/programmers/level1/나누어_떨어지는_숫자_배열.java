package com.osageu.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;

public class 나누어_떨어지는_숫자_배열 {

	public int[] solution(int[] arr, int divisor) { // {5, 9, 7, 10};
        int[] answer = {};

        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;
        for(int num : arr) {
        	result = num % divisor;
        	if(result == 0) {
        		list.add(num);
        	}
        }
        Collections.sort(list);
        if(list.isEmpty()) {
        	answer = new int[1];
        	answer[0] = -1;
        }else {
        	answer = new int[list.size()];
        	for(int i = 0 ; i < answer.length ; i++) {
        		answer[i] = list.get(i);
        	}
        }
        
        return answer;
    }
	
}
