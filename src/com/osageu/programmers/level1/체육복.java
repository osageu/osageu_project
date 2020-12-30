package com.osageu.programmers.level1;

import java.util.Arrays;

public class 체육복 {
	public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        // 1. 현재 가진 옷의 개수 배열
        int[] clothes = new int[n+2];
        for (int i = 1 ; i < clothes.length-1 ; i++){
        	clothes[i] = 1;
        }
        for (int i = 0 ; i < lost.length ; i++){
        	clothes[lost[i]] = 0;
        }
        for (int i = 0 ; i < reserve.length ; i++){ 
        	clothes[reserve[i]] = 2;
        }
        for (int i = 0 ; i < reserve.length ; i++) {
			for (int j = 0 ; j < lost.length ; j++) {
				if (reserve[i] == lost[j]) {
					clothes[reserve[i]] = 1;
				}
			}
		}
        int[] copy = Arrays.copyOf(clothes, clothes.length);
        // 2-1. 옷 나눠주기 
        for(int i = 1 ; i < clothes.length-1 ; i++) {
        	if (clothes[i] == 2 && clothes[i+1] == 0) {
        		clothes[i] = 1;
        		clothes[i+1] = 1;
        	}
        }
        for(int i = clothes.length-1 ; i > 0 ; i--) {
        	if (clothes[i] == 2 && clothes[i-1] == 0) {
        		clothes[i] = 1;
        		clothes[i-1] = 1;
        	}
        }
        // 3-1. 체육할 수 있는 인원 카운트
        for (int i = 1 ; i < clothes.length-1 ; i++) {
        	if (clothes[i] == 2) {
        		clothes[i] = 1;
        	}
        	if (clothes[i] == 1) {
        		answer++;
        	}
        }
        
        int answer2 = 0;
        // 2-2. 옷 나눠주기
        for(int i = copy.length-1 ; i > 0 ; i--) {
        	if (copy[i] == 2 && copy[i-1] == 0) {
        		copy[i] = 1;
        		copy[i-1] = 1;
        	}
        }
        for(int i = 1 ; i < copy.length-1 ; i++) {
        	if (copy[i] == 2 && copy[i+1] == 0) {
        		copy[i] = 1;
        		copy[i+1] = 1;
        	}
        }
        // 3-2. 체육할 수 있는 인원 카운트
        for (int i = 1 ; i < copy.length-1 ; i++) {
        	if (copy[i] == 2) {
        		copy[i] = 1;
        	}
        	if (copy[i] == 1) {
        		answer2++;
        	}
        }
        return Math.max(answer, answer2);
    }
}
