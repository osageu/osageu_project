package com.osageu.SixshopTest;

import java.util.Arrays;

public class Sixshop2 {

	public static void main(String[] args) {

//		int[] iArr = {2, 2, 1}; // { 1, 1, 3 }
		int[] iArr = {3, 2, 1, 2}; // { 1, 2, 4, 2 }
		int[] result = new int[iArr.length];
		
		int[] copy = Arrays.copyOf(iArr, iArr.length);
		Arrays.sort(copy);
		int high = copy[copy.length-1];
		
		
		int countEnd = 0;
		int countRank = 1;
		while(countEnd < result.length) {
			int same = -1;
			for(int i = 0 ; i < iArr.length ; i++) { // h 3, cR 1, cE 1 --> h 2, cR 2, cE 1
													 // h 2, cR 2, cE 3 --> h 1, cR 5, cE 3
				if(iArr[i] == high) {
					result[i] = countRank;
					countEnd++;
					same++;
				}
			}
			countRank+=(1+same);
			high--;
		}
		
		System.out.println(Arrays.toString(result));
		
	}

}
