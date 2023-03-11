package com.dsa.LinearSearch;

public class Q001_LinearSearch_string {

	//Linear search in String
	public static void main(String[] args) {
		String y="Yogender";
		System.out.println(StringSearch(y, 'e'));



	}public static int StringSearch(String s,char target) {
		s.toLowerCase();
		char[] ch= s.toCharArray();
		for(int i=0;i<=ch.length-1;i++) {
			if(ch[i]==target) {
				return i;
			}
		}return -1;
	}

}
