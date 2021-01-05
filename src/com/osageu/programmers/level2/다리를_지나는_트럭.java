package com.osageu.programmers.level2;

import java.util.Arrays;

public class 다리를_지나는_트럭 {
	public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        
        int[] bridge = new int[bridge_length];
        int truck = 0;
        while(true) {
        	
        	if(answer == 0) {
        		bridge[0] = truck_weights[truck];
        	}else {
        		
        		// 결승선 전 트럭 통과시키기
            	if(bridge[bridge_length-1] != 0) {
            		bridge[bridge_length-1] = 0;
            	}
            	
            	// 다리 위 트럭의 총 무게
            	int sum = 0;
            	for(int a : bridge) {
            		sum+=a;
            	}
            	
            	// 조건 검사
            	int[] copy = Arrays.copyOfRange(bridge, 0, bridge.length-1);
            	for(int i = 1 ; i < bridge.length ; i++) {
            		bridge[i] = copy[i-1];
            	}
            	if(truck != truck_weights.length-1) {
            		if(sum + truck_weights[truck+1] <= weight) { // 다음 트럭 가능
                		bridge[0] = truck_weights[++truck];
            		}else{ // 다음 트럭 불가
            			bridge[0] = 0;
            		}
            	}else {
            		bridge[0] = 0;
            	}
        		
        		// 모든 트럭 통과했는지 검사
        		for(int a : bridge) {
            		sum+=a;
            	}
        		if(sum == 0) {
        			answer++;
        			break;
        		}
        		
        	}
        	
        	answer++;
        	
        }
        
        return answer;
    }
}
