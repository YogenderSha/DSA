package com.dsa.Strings;

public class Q027_String_ValidPalindrome {

	public static void main(String[] args) {
		String s = " ";
		System.out.println(isValidPalindrome(s));

	}

	public static boolean isValidPalindrome(String s) {
		s = s.toLowerCase();
		StringBuilder b = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
				b.append(s.charAt(i));
			}
		}
		
		if(b==null || b.length()==0) {
			return true;
		}
		
		int n = b.length() - 1;
		for (int i = 0; i <= b.length() / 2; i++) {
			if (b.charAt(i) != b.charAt(n - i)) {
				return false;
			}
		}
		return true;
	}

}
