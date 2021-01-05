package com.osageu.programmers.level2;

import java.util.ArrayList;

public class 기능개발 {
	public int[] solution(int[] progresses, int[] speeds) {
	       int[] answer;
	       
	       // 정답용 --> 나중에 answer로 변환
	       ArrayList<Integer> result = new ArrayList<>();
	       int saveIndex = 0;
	       while(true) {
	    	   
	    	   // 하루마다 speeds 더해주기
	    	   for(int i = 0 ; i < progresses.length ; i++) {
	    		   if(progresses[i] != 0) {
	    			   progresses[i] += speeds[i];
	    		   }
	    	   }
	    	   
	    	   // count --> 100%이상인 작업들의 수
	    	   // 100%이상 완료된 작업 계산
	    	   int count = 0;
	    	   for(int i = saveIndex ; i < progresses.length ; i++) {
	    		   if(progresses[i] >= 100) {
	    			   progresses[i] = 0;
	    			   count++;
	    		   }else {
	    			   saveIndex = i;
	    			   break;
	    		   }
	    	   }
	    	   if(count != 0) {
	    		   result.add(count);
	    	   }
	    	   
	    	   // 모든 작업이 완료되었는지 확인
	    	   int end = 0;
	    	   for(int a : progresses) {
	    		   end += a;
	    	   }
	    	   if(end == 0) {
	    		   break;
	    	   }
	    	   
	       }
	       
	       // List --> int array
	       answer = new int[result.size()];
	       for(int i = 0 ; i < answer.length ; i++) {
	    	   answer[i] = result.get(i);
	       }
	       
	       return answer;
	}
}
