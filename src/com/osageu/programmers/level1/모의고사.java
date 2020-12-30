package com.osageu.programmers.level1;

import java.util.ArrayList;

public class 모의고사 {
	 public int[] solution(int[] answers) {
	        // 1번 수포자 : [ 1, 2 ,3 ,4 ,5 ] x 무한 = 5번
	        // 2번 수포자 : [ 2, 1, 2, 3, 2, 4, 2, 5 ] x 무한 = 8번
	        // 3번 수포자 : [ 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 ] x 무한 = 10번
	        // 1) 배열을 이용하는 방법
	        // 1. 답의 길이 만큼 빈 리스트 만들기 & 패턴
	        ArrayList<Integer> a = new ArrayList<>();
	        int[] az = {1,2,3,4,5};
	        ArrayList<Integer> b = new ArrayList<>();
	        int[] bz = {2,1,2,3,2,4,2,5};
	        ArrayList<Integer> c = new ArrayList<>();
	        int[] cz = {3,3,1,1,2,2,4,4,5,5};
	        // 2. 빈 배열에 수포자들 답을 채워넣기
	        int i = 0;
	        int j = 0;
	        int k = 0;
	        while(true) {
	        	a.add(az[i]); b.add(bz[j]); c.add(cz[k]);
	        	i++; j++; k++;
	        	if (i == 5) {
	        		i = 0;
	        	} 
	        	if (j == 8) {
	        		j = 0;
	        	} 
	        	if (k == 10) {
	        		k = 0;
	        	}
	        	if (c.size() == answers.length) {
	        		break;
	        	}
	        }
	        // 3. 수포자의 답과 문제 답 맞춰보기
	        int count1 = 0;
	        int count2 = 0;
	        int count3 = 0;
	        for (int z = 0 ; z < answers.length ; z++) {
	        	if (a.get(z) == answers[z]) {
	        		count1++;
	        	}
	        }
	        for (int z = 0 ; z < answers.length ; z++) {
	        	if (b.get(z) == answers[z]) {
	        		count2++;
	        	}
	        }
	        for (int z = 0 ; z < answers.length ; z++) {
	        	if (c.get(z) == answers[z]) {
	        		count3++;
	        	}
	        }
	        // 4. 맞춘 개수로 리턴값 정의하기
	        int[] test = {count1, count2, count3};
	        ArrayList<Integer> fin = new ArrayList<>();
	        int kk = 0; // count1,2,3 중 가장 큰 값
	        for ( int x = 0 ; x < test.length-1 ; x++) {
	        	if (x == 0) {
	        		kk = test[x];
	        	}
	        	kk = Math.max(kk, test[x+1]);
	        }
	        for ( int h = 0 ; h < test.length ; h++) {
	        	if (test[h] == kk) {
	        		fin.add(h+1);
	        	}
	        }
	        int[] end = new int[fin.size()];
	        for (int z = 0 ; z < end.length ; z++) {
	        	end[z] = fin.get(z);
	        }
	        return end;
	    }
}
