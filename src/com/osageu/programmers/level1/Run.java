package com.osageu.programmers.level1;

public class Run {

	public static void main(String[] args) {
		
//		int[] iArr = {1,3,4,5,8,2,1,4,5,9,5};
//		String s = "right";
//		int[] iArr = {7,0,8,2,8,3,1,5,7,6,2};
//		String s = "left";
		int[] iArr = {1,2,3,4,5,6,7,8,9,0};
		String s = "right";
		String result = new Click_keypad().solution(iArr, s);
		System.out.println(result);
		
	}

}
