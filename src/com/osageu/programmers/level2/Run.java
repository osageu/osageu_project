package com.osageu.programmers.level2;

import java.util.Arrays;

public class Run {
	public static void main(String[] args) {
		
		int[] progresses = {95, 90, 99, 99, 80, 99}; 
		int[] speeds = {1, 1, 1, 1, 1, 1};
		int[] result = new 기능개발().solution(progresses, speeds);
		System.out.println(Arrays.toString(result));
		
	}
}
