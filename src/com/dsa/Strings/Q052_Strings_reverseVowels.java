package com.dsa.Strings;

public class Q052_Strings_reverseVowels {

	public static void main(String[] args) {
		
		String h="hello";
		System.out.println(reverseVowels(h));
 
	}

	public static boolean isvowel(char x) {
		if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O'
				|| x == 'U') {
			return true;
		}
		return false;
	}

	public static String reverseVowels(String s) {

		int start = 0;
		int end = s.length() - 1;
		char[] ch = s.toCharArray();

		while (start < end) {
			if (isvowel(ch[start]) && isvowel(ch[start])) {
				swap(ch,start,end);
				start++;
				end--;
			} else if (isvowel(ch[start])) {
				end--;
			} else {
				start++;
			}
		}
		String str=new String(ch);
		return str;
	}

	public static void swap(char[]ch,int start, int end) {
		char temp=ch[start];
		ch[start]=ch[end];
		ch[end]=temp;
	}

}
