package com.dsa.Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q075_String_lengthOfLongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	public static int lengthOfLongestSubstring(String s) {
		
		   int maxLength = 0;
		    int start = 0;
		    int end = 0;
		    Set<Character> uniqueChars = new HashSet<>();

		    while (end < s.length()) {
		        if (!uniqueChars.contains(s.charAt(end))) {
		            uniqueChars.add(s.charAt(end));
		            maxLength = Math.max(maxLength, uniqueChars.size());
		            end++;
		        } else {
		            uniqueChars.remove(s.charAt(start));
		            start++;
		        }
		    }

		    return maxLength;
		
		
		
	/*
       if(s.length()==0||s.length()==1) {
    	   return s.length();
       }
       int maximum=0;
	   Set<Character> list=new HashSet()<Character>();
	   
       int start=0;
       int end=0;
       while(end<s.length()) {
    	   if(!list.contains(s.charAt(end))) {
    		   list.add(s.charAt(end));
    		   end++;
    	   }else {
    		   maximum=Math.max(maximum, end-start);
    		   start=end+1;
    		   end=end+1;
    		   list=new ArrayList<Character>();	   
    	   }
       }
       return maximum;
       */
    }
	
 

}
