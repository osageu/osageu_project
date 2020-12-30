package com.osageu.programmers.level1;

public class 비밀지도 {
	public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        // 1. 배열의 원소를 이진수로 바꾸기	
        int[][] binary1 = new int[n][n];
        int[][] binary2 = new int[n][n];
        
        // 1-1. 지도1 
        for(int i = 0 ; i < n ; i++) {
        	int index = n-1;
        	while(true) {
        		if(arr1[i] == 0) {
        			break;
        		}
        		if(arr1[i] == 1) {
        			binary1[i][index] = 1;
        			break;
        		}else {
        			binary1[i][index] = arr1[i]%2;
        			arr1[i] = arr1[i]/2;
        			index--;
        		}
        	}
        }
        
        // 1-2. 지도2
        for(int i = 0 ; i < n ; i++) {
        	int index = n-1;
        	while(true) {
        		if(arr2[i] == 0) {
        			break;
        		}
        		if(arr2[i] == 1) {
        			binary2[i][index] = 1;
        			break;
        		}else {
        			binary2[i][index] = arr2[i]%2;
        			arr2[i] = arr2[i]/2;
        			index--;
        		}
        	}
        }
        
        // 2. 두 지도를 겹쳐 하나의 지도로 만들기
        int[][] sum = new int[n][n];
        for(int i = 0 ; i < n ; i++) {
        	for(int j = 0 ; j < n ; j++) {
        		sum[i][j] = binary1[i][j] + binary2[i][j];
        	}
        }
        
        // 3. 암호 해석하기
        for(int i = 0 ; i < n ; i++) {
        	String input = "";
        	for(int j = 0 ; j < n ; j++) {
        		input += sum[i][j] == 0 ? " " : "#";
        	}
        	answer[i] = input;
        }
        
        return answer;
    }
}
