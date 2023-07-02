package com.dsa.SlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Q059_slidingWin_lengthOfLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLongestSubstring(String s) {
		
		//Adding the Values in the set
		Set<Character> set = new HashSet<Character>();;
		for(int i=0;i<s.length();i++) {
			if(set.contains(s.charAt(i))) {
				
			}else {
				set.add(s.charAt(i));
			}
			
		}
		
		//
		

	}

}
