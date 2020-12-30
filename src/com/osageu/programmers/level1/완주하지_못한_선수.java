package com.osageu.programmers.level1;
import java.util.HashMap;

public class 완주하지_못한_선수 {
	
	// 이 문제는 나의 해답 코드를 잃어버려서 타인의 답을 가져옴
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hm = new HashMap<>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
	
}
