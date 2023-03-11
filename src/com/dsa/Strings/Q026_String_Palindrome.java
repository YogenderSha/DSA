package com.dsa.Strings;

public class Q026_String_Palindrome {
	/*
	 * 9. Palindrome Number {leetcode}
	 */
	
	

	public static void main(String[] args) {
                 String str="";
                 System.out.println(isPalindrome(str));
	}
	
	public static boolean isPalindrome(String s) {
		
		if(s==null || s.length()==0) {
			return true;
		}
		
		s=s.toLowerCase();
		s=s.strip();
		for(int i=0;i<=s.length()/2;i++) {
			char start=s.charAt(i);
			char end=s.charAt(s.length()-1-i);
			if(start!=end) {
				return false;
			}
		}
		return true;
		
	}

}
