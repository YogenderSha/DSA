package com.dsa.Strings;

import java.util.ArrayList;
import java.util.List;

public class Q074_String_lengthOfLongestSubSeq {

	public static void main(String[] args) {
		String s = "abcabcbb";
		System.out.println(lengthOfLongestSubSeq(s));
	}
	public static int lengthOfLongestSubSeq(String s) {
        List<Character> list=new ArrayList<Character>();
		int i=0;
		while(i<s.length()) {
		   if(!list.contains(s.charAt(i))) {
			   list.add(s.charAt(i));
		   }
		   i++;
		}
		return list.size();
	}

}
