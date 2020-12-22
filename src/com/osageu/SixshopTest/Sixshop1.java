package com.osageu.SixshopTest;

import java.util.ArrayList;

public class Sixshop1 {

	public static void main(String[] args) {
		
		String a = "ABCxy";
		String b = "xyZA";
		
		String answer = "";
		
		String test =""; 
		ArrayList<String> list = new ArrayList<>();
		for(int i = 0 ; i < a.length() ; i++) {
			test += a.charAt(i);
			if(b.contains(test)) {
				list.add(test);
			}
		}
		a.replaceAll(list.get(list.size()-1),"");
		String changeStr1 = a.replaceAll(list.get(list.size()-1),"");
		
		list.clear();
		test="";
		for(int i = 0 ; i < b.length() ; i++) {
			test += b.charAt(i);
			if(a.contains(test)) {
				list.add(test);
			}
		}
		b.replaceAll(list.get(list.size()-1),"");
		String changeStr2 = b.replaceAll(list.get(list.size()-1),"");
		
		
		
		if((b+changeStr1).length() < (a+changeStr2).length()) {
			answer = b+changeStr1;
		}else if((b+changeStr1).length() > (a+changeStr2).length()) {
			answer = a+changeStr2;
		}else {
			if((b+changeStr1).compareTo(a+changeStr2) == -1) {
				answer = b+changeStr1;
			}else if((b+changeStr1).compareTo(a+changeStr2) == 1) {
				answer = a+changeStr2;
			}
		}
		System.out.println(answer);
	}

}
