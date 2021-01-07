package com.osageu.programmers.level2;

public class Run {
	public static void main(String[] args) {
		
		int[] priorities = {2, 2, 2, 1, 3, 4}; // 4, 2, 2, 2, 1, 3
		int location = 3;
		int result = new 프린터().solution(priorities, location);
//		System.out.println(Arrays.toString(result));
		System.out.println(result);
		
		/*
		 * 10, 9, 1, 5, 3, 2, 1, 1 : 1
		 * 9, 1, 5, 3, 2, 1, 1 : 2
		 * 1, 5, 3, 2, 1, 1 : 3
		 * 3, 2, 1, 1, 1 : 4
		 * 2, 1, 1, 1 : 5
		 * 1, 1, 1 : 6
		 * 1, 1 : 7
		 * 1 : 8
		 * 
		 */
	}
}
