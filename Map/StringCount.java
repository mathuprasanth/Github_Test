package com.fita.team2.Map;

import java.util.HashMap;
import java.util.Map;

public class StringCount {
	
	static void count(String value) {
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		
		char[] change=value.toCharArray();
		
		for(char m:change) {
			if(hm.containsKey(m)) {
				hm.put(m,hm.get(m)+1);
			}else {
				hm.put(m,1);
			}
		}
		for(Map.Entry r : hm.entrySet()) {
			System.out.println(r.getKey()+" ---> "+r.getValue());
			
		}
	}
	
	
	

	public static void main(String[] args) {
		
		String name="mathurasanth";
		count(name);
	}

}
