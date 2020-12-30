package com.osageu.programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class 문자열_내_마음대로_정렬하기 {
	
	public String[] solution(String[] strings, int n){
		String[] answer = {};
		
		// 1. 가장 기본 Map 생성 --> key는 String 배열 원소, value는 n번째에서 뽑아낸 Character
		Map<String, Character> map = new HashMap<>();
        for(String str : strings) {
        	char index = str.charAt(n);
        	map.put(str, index);
        }
        
        // 2. value 오름차순으로 정렬하고, value가 같으면 key 오름차순으로 정렬
        // 2-1. Map to List
        List<Map.Entry<String, Character>> list = new LinkedList<>(map.entrySet());
        
        // 2-2. sort
        Collections.sort(list, new Comparator<Map.Entry<String, Character>>() {
            @Override
            public int compare(Map.Entry<String, Character> o1, Map.Entry<String, Character> o2) {
                int comparision = (o1.getValue() - o2.getValue());
                return comparision == 0 ? o1.getKey().compareTo(o2.getKey()) : comparision; // 비교해서 작은 것이 위(왼쪽)로가게
            }
        });
        
        answer = new String[list.size()];
        for(int i = 0 ; i < list.size() ; i++) {
        	answer[i] = list.get(i).getKey();
        }
        
        return answer;
	}
	
	// 다른 사람 정답 1
	public String[] solution1(String[] strings, int n) {
	      Arrays.sort(strings, new Comparator<String>(){
	          @Override
	          public int compare(String s1, String s2){
	              if(s1.charAt(n) > s2.charAt(n)) return 1;
	              else if(s1.charAt(n) == s2.charAt(n)) return s1.compareTo(s2);
	              else if(s1.charAt(n) < s2.charAt(n)) return -1;
	              else return 0;
	          }
	      });
	      return strings;
	}
	
	// 다른 사람 정답 2
	public String[] solution2(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
	
}
