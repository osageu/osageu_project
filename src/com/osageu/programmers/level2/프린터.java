package com.osageu.programmers.level2;

import java.util.ArrayList;
import java.util.Collections;

public class 프린터 {
	public int solution(int[] priorities, int location) {
        int answer = 0;
        	
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : priorities) {
        	list.add(a);
        }
        
        while(true) {
        	location = change(list, location);
        	int first = list.get(0);
        	int max = Collections.max(list);
        	list.remove(0);
        	answer++;
        	
        	if(location == 0 && first == max) {
        		break;
        	}else {
        		location--;
        	}
        }
        
        return answer;
    }
	
	public int change(ArrayList<Integer> list, int location){
		
		while(true) {
        	if(list.get(0) < Collections.max(list)) {
        		int first = list.get(0);
        		list.remove(0);
        		list.add(first);
        		if(location != 0) {
        			location--;
        		}else {
        			location = list.size()-1;
        		}
        	}else {
        		break;
        	}
        }
		return location;
	}
	
}
