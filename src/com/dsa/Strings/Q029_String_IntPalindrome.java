package com.dsa.Strings;

public class Q029_String_IntPalindrome {

	public static void main(String[] args) {
		

	}public static boolean isPalindrome(int n) {
		int num=CountDigit(n);
		for(int i=0;i<num;)
		
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
	
	
	public static int CountDigit(int num) {
		int count=0;
		  while (num != 0) {
		      // num = num/10
		      num /= 10;
		      ++count;
		    }
		  return count;
	}
	
	

}
