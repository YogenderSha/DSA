package com.dsa.LinearSearch;

import java.util.HashMap;
import java.util.Map;

public class codechef2 {

	public static void main(String[] args) {
		

	}
	public static int isPossiblePalindrome(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		if(hasKeyWithOddValue(map)) {
			return 
		}
		
	}
	
	public static Map<Character, Integer> getCharacterCountMap(String str) {
        Map<Character, Integer> characterCountMap = new HashMap<Character, Integer>();
        for (char ch : str.toCharArray()) {
            characterCountMap.put(ch, characterCountMap.getOrDefault(ch, 0) + 1);
        }
        return characterCountMap;
    }
	
	
	 public static boolean hasKeyWithOddValue(Map<Character, Integer> map) {
		 int odd=0;
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            if (entry.getValue() % 2 != 0) {
	                odd++;
	            }
	            
	            if(odd>=2) {
	            	return true;
	            }
	        }
	        return false;
	    }

}
