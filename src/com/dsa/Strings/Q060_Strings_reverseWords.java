package com.dsa.Strings;

public class Q060_Strings_reverseWords {

	public static void main(String[] args) {
		String str = "Abhinay is gandu";
		System.out.println(reverseWords1(str));

	}

	public static String reverseWords(String s) {
		int i = 0;
		String temp, ans = "";
		while (i < s.length()) {
			temp = "";
			while (s.charAt(i) == ' ' && i < s.length()) {
				i++;
			}
			while (s.charAt(i) != ' ' && i < s.length()) {
				temp = temp + s.charAt(i);
			}
			if (temp.length() > 0) {
				if (ans.length() == 0) {
					ans = temp;
				} else {
					ans = temp + " " + ans;
				}

			}

		}
		return ans;
	}
	
	
	
	
	public static String reverseWords1(String s) {
		StringBuilder sb=new StringBuilder();
		for (int start= s.length()-1;start>=0;start--) {
			if(s.charAt(start)==' ') {
				start--;
			}
			int end=start;
			while( start>=0  && s.charAt(start)!=' ' ) {
				start--;
			}
			sb.append(s.substring(start+1, end+1)).append(' ');
		}
		return sb.toString().strip();
	}
}
