package com.osageu.programmers.level2;

public class 스킬트리 {
	 public int solution(String skill, String[] skill_trees) {
	        int answer = 0;
	        StringBuilder sb = new StringBuilder();
	        // next 
	        for ( int i = 0 ; i < skill_trees.length ; i++) {
	        	
	        	for ( int j = 0 ; j < skill_trees[i].length() ; j++) { // j open
	        		
	        		for ( int k = 0 ; k < skill.length() ; k++) { // k open
	        			
	        			// 2. sb에 B,C,D만 담기 
	        			if (skill_trees[i].charAt(j) == skill.charAt(k)) {
	        				sb.append(skill_trees[i].charAt(j));
	        			} 
	        			
	        		} // k close
	        		
	        	} // j close
	        	
	        	// 3. sb와 skill을 비교해서 값 추가
	        	// skill = C , tree : ACD
	        	if (sb.length() == 0) {
	        		answer++;
	        	} else if (skill.charAt(0) == sb.charAt(0) && skill.contains(sb)) {
	        		answer++;
	        	}
	        	
	        	// sb초기화
	        	sb.delete(0, sb.length());
	        	
	        }
	        return answer;
	    }
}
