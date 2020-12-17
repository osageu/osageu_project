package com.osageu.programmers.level1;

public class Run {

	public static void main(String[] args) {
		
		int[] arr1 = {5, 9, 7, 10};
		int[] arr2 = {2, 36, 1, 3};
		int[] arr3 = {3, 2, 6};
		
		int[] result = new Divide0().solution(arr3, 10);
		for(int a : result) {
			System.out.println(a + " ");
		}
	}

}
