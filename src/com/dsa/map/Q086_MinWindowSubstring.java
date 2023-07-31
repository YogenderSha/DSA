package com.dsa.map;

import java.util.HashMap;
import java.util.Map;

public class Q086_MinWindowSubstring {

	public static void main(String[] args) {

	}

	public static String minWindowSubstring(String s, String t) {
		if (s.length() == 0 || t.length() == 0)
			return "";

		Map<Character, Integer> targetList = new HashMap<>();
		Map<Character, Integer> currentList = new HashMap<>();

		// put characters from t to targetList Map
		for (char c : t.toCharArray()) {
			targetList.put(c, targetList.getOrDefault(c, 0) + 1);
		}
		
		
        //Initializing the variavles  ; minWinStart = to store the first index of min window ; 
		//requiredChar = total char in the targettList.
		//rightChar = Right no. of characters in currentIst i.e. similar charater. 
		
		int left = 0, minWindowStart = 0 , minWindow = Integer.MAX_VALUE;
		int requiredChars = targetList.size() , validCharNum = 0;

		for (int end = 0; end < s.length(); end++) {
			char rightChar = s.charAt(end);
			currentList.put(rightChar, currentList.getOrDefault(rightChar, 0) + 1);

			// Check if a required character is found
			if (targetList.containsKey(rightChar) && currentList.get(rightChar).equals(targetList.get(rightChar))) {
				validCharNum++;
			}
			// Contract the window from the left until it's no longer valid
			while (validCharNum == requiredChars && left <= end) {
				int window = end - left + 1;
				if (window < minWindow) {
					minWindow = window;
					minWindowStart = left;   //Don't forget to set the minWinStart
				}

				char leftChar = s.charAt(left);
				currentList.put(leftChar, currentList.get(leftChar) - 1);
				
				
                // To check whether we have removed a valid character
				if (targetList.containsKey(leftChar) && currentList.get(leftChar) < targetList.get(leftChar)) {
					validCharNum--;
				}

				left++;
			}
		}
		// Check if a valid window is found
		if (minWindow == Integer.MAX_VALUE) {
			return "";
		} else {
			return s.substring(minWindowStart, minWindowStart + minWindow);
		}
	}







}
