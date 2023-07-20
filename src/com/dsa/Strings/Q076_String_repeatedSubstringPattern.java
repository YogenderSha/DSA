package com.dsa.Strings;

public class Q076_String_repeatedSubstringPattern {

	public static void main(String[] args) {
		String s = "abcabcabcabc" ;
		System.out.println(repeatedSubstringPattern(s)); 
	}

	public static boolean repeatedSubstringPattern(String s) {
		int n=s.length();
        for (int i=n/2;i>=1;i--) {
        	if(n%i==0) {
        		String subst=s.substring(0, i);
        		StringBuilder sb=new StringBuilder();
        		
        		for (int j=1;j<=n/i;j++) {
        			sb.append(subst);
        		}
        		
        		if(sb.toString().equals(s)) {
        			return true;
        		}
        	}
        }
        return false;
	}

}
