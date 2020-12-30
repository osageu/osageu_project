package com.osageu.programmers.level1;

public class 평균_구하기 {
	public double solution(int[] arr) {
        double answer = 0;
        for(int a : arr) {
        	answer += a;
        }
        answer = answer/arr.length;
        return answer;
    }
}
