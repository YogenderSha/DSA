package com.dsa.Strings;

public class Q028_String_ValidPalindrom2 {

	public static void main(String[] args) {
		// a b a b c d e b a b a
		String s = null;
		System.out.println(isPalindrome(s));

	}

	public static boolean isPalindrome(String s) {
		if (s == null || s.length() == 0) {
			return true;
		}
		int i = 0;
		int j = s.length() - 1;

		s = s.toLowerCase();

		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {

				return isValidPalindrome(s, i + 1, j) || isValidPalindrome(s, i, j - 1);

			}

		}
		return true;
	}

	public static boolean isValidPalindrome(String s, int i, int j) {
		while (i < j) {
			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {
				return false;
			}
		}
		return true;
	}

}
