package com.osageu.programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class 실패율 {
	public int[] solution(int N, int[] stages) {
		int[] answer = new int[N];

        HashMap<Integer, Double> list = new HashMap<>();
        double divisor = stages.length;
        for(int i = 0 ; i <= N ; i++) {

            int count = 0; // 아직 클리어 못 한 유저수
            for(int j = 0 ; j < stages.length; j++) {
                if(stages[j] == i+1) {
                    count++;
                }
            }
            if(i < N && divisor != 0) {
                list.put(i+1, count/divisor);
            }else if( i < N && divisor == 0){
                list.put(i+1, divisor);
            }
            divisor = divisor-count;

        }

        List<Integer> keySetList = new ArrayList<>(list.keySet());
        Collections.sort(keySetList, (o1, o2) -> (list.get(o2).compareTo(list.get(o1))));
        for(int i = 0 ; i < N ; i++) {
            answer[i] = keySetList.get(i);
        }

        return answer;
    }
}
