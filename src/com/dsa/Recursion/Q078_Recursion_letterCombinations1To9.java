package com.dsa.Recursion;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/   for 1-9 Dialpad
public class Q078_Recursion_letterCombinations1To9 {

	public static void main(String[] args) {
		
		pad("","12");
		System.out.println(leeterComb("","12")); 

	}

	//public static List<String> letterCombinations(String digits) {
	//}
	
	public static void pad(String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		int digit=up.charAt(0)-'0';
		for (int i=(digit-1)*3;i<digit*3;i++) {
			char ch=(char) ('a'+i);
			pad(p+ch, up.substring(1));
		}
	}
	
	public static List<String> leeterComb(String p, String up) {
		if(up.isEmpty()) {
			List<String> list=new ArrayList<>();
			list.add(p);
			return list;
		}
		List<String> result=new ArrayList<>(); 
		int digit=up.charAt(0)-'0';
		for (int i=(digit-1)*3;i<digit*3;i++) {
			char ch=(char) ('a'+i);
			result.addAll(leeterComb(p+ch, up.substring(1))) ;
		}
		return result;
	}

}
