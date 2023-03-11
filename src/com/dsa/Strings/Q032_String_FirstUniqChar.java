package com.dsa.Strings;

public class Q032_String_FirstUniqChar {

	public static void main(String[] args) {
		String str="leetcode";
		System.out.println(FirstUniqChar(str));

	}
	public static int FirstUniqChar(String s) {
		int[] count=new int[26];
		//array initilisation
		
		for(char c: s.toCharArray())
			count[c-'a']+=1;
		//storing the values in the array
		
		for(int i=0;i<s.length();i++)
			if(count[s.charAt(i)-'a']==1)
				return i;
		
		return -1;
	}

}
