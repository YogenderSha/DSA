package com.dsa.Strings;

public class Q073_String_isSubsequence {

	public static void main(String[] args) {
             String s = "abc", t = "ahbgdc";
             System.out.println(isSubsequence(s, t));
	}
	public static boolean isSubsequence(String s, String t) {
        int x=0,y=0;
        while(x <s.length() && y<t.length()) {
        	if(s.charAt(x)==t.charAt(y)) {
        		x++;
        	}
          y++;
        }
        return x==s.length();

    }
	

}
