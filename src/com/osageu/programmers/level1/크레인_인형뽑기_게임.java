package com.osageu.programmers.level1;

import java.util.ArrayList;

public class 크레인_인형뽑기_게임 {
	
	public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int input = 0;
        
        ArrayList<Integer> baguni = new ArrayList<>();
        for(int i = 0 ; i < moves.length ; i++) { // moves 반복문
        	
        	for(int j = 0 ; j < board.length ; j++) { // board 반복문
        		input = board[j][moves[i]-1];
        		if(input != 0) {
        			board[j][moves[i]-1] = 0;
        			baguni.add(input);
        			if(baguni.size() >= 2 && (baguni.get(baguni.size()-1) == baguni.get(baguni.size()-2))) {
						baguni.remove(baguni.size()-1);
						baguni.remove(baguni.size()-1);
						answer += 2;
        			}
        			break;
        		}
        	}
        	
        }
        
        return answer;
    }
	
}
