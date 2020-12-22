package com.osageu.SixshopTest;

public class Sixshop3 {

	public static void main(String[] args) {
		int n = 7; 
		int answer = 0;
		
		int count1 = 1;
		int count2 = 1;
		while(n > 0) { 
			n = n-5; 
			if(n%3 != 0 && n >= 5) { 
				count1++;
			}else {
				if(n%3==0) {
					count1 += n/3;
					break;
				}else {
					count1=-1;
					break;
				}
			}
		}
		
		n = 7;
		while(n > 0) { 
			n = n-3; 
			if(n%5 != 0 && n >= 3) { 
				count2++;
			}else {
				if(n%5==0) {
					count2 += n/5;
					break;
				}else {
					count2=-1;
					break;
				}
			}
		}
		if(count1 <= count2) {
			answer = count1;
		}else {
			answer = count2;
		}
		
		System.out.println(answer);
		
	}
	
}
