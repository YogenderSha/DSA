package com.dsa.Strings;

public class Q045_String_FirstOccurance {

	public static void main(String[] args) {
		String a = "mississippi";
		String b="issip";
		System.out.println(strStr(a, b));
 
	}
	
	 public static boolean isConsists(String haystack, String needle) {
	        int p1=0; 
	        int p2=needle.length()-1; 
	        while(p2<haystack.length()) {
	        	if(haystack.substring(p1, p2+1).equals(needle)) {
	        		return true;
	        	}
	        	p1++;
	        	p2++;
	        }
        	return false;

	    }
	 
	 public static int strStr(String haystack, String needle) {
	        int p1=0; 
	        int p2=needle.length()-1; 
	        while(p2<haystack.length()) {
	        	if(haystack.substring(p1, p2+1).equals(needle)) {
	        		return p1;
	        	}
	        	p1++;
	        	p2++;
	        }
     	return -1;

	    }

}
