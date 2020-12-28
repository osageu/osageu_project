package com.osageu.programmers.level1;

public class Click_keypad {
	public String solution(int[] numbers, String hand) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
		int leftX = -1;
		int leftY = -2;
		int rightX = 1;
		int rightY = -2;
		int midX = 0;
		int midY = 0;
		double left_mid = 0;
		double right_mid = 0;
		
		for(int i = 0 ; i < numbers.length ; i++) {
			
			switch(numbers[i]){
				case 1 : leftX = -1; leftY = 1; break;
				case 4 : leftX = -1; leftY = 0; break;
				case 7 : leftX = -1; leftY = -1; break;
				case 3 : rightX = 1; rightY = 1; break;
				case 6 : rightX = 1; rightY = 0; break;
				case 9 : rightX = 1; rightY = -1; break;
				case 2 : midX = 0; midY = 1;
						 left_mid = Math.abs(leftX-midX) + Math.abs(leftY-midY);
						 right_mid = Math.abs(rightX-midX) + Math.abs(rightY-midY);
						 break;
				case 5 : midX = 0; midY = 0;
						 left_mid = Math.abs(leftX-midX) + Math.abs(leftY-midY);
						 right_mid = Math.abs(rightX-midX) + Math.abs(rightY-midY);
						 break;
				case 8 : midX = 0; midY = -1;
						 left_mid = Math.abs(leftX-midX) + Math.abs(leftY-midY);
						 right_mid = Math.abs(rightX-midX) + Math.abs(rightY-midY);
						 break;
				case 0 : midX = 0; midY = -2;
						 left_mid = Math.abs(leftX-midX) + Math.abs(leftY-midY);
						 right_mid = Math.abs(rightX-midX) + Math.abs(rightY-midY);
						 break;
			}
			
			if(numbers[i]%3 == 1) {
				sb.append("L");
			}else if(numbers[i]%3 == 0 && numbers[i] != 0) {
				sb.append("R");
			}else if((numbers[i]%3 == 2 || numbers[i] == 0) && left_mid < right_mid) {
				sb.append("L");
				leftX = midX;
				leftY = midY;
			}else if((numbers[i]%3 == 2 || numbers[i] == 0) && left_mid > right_mid) {
				sb.append("R");
				rightX = midX;
				rightY = midY;
			}else if((numbers[i]%3 == 2 || numbers[i] == 0) && left_mid == right_mid) {
				if(hand.equals("right")) {
					sb.append("R");
					rightX = midX;
					rightY = midY;
				}else {
					sb.append("L");
					leftX = midX;
					leftY = midY;
				}
			}
		}
		answer = sb.toString();
        
        return answer;
    }
}
