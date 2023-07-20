package com.dsa.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Q077_Recursion_Permutation {

	public static void main(String[] args) {

		permutation("", "abc");

	}
	
	//With Recursion 
	public static void permutation (String p, String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return ;
		}
		char ch=up.charAt(0);
		for (int i=0;i<=p.length();i++) {
			String first=p.substring(0,i);
			String last=p.substring(i,p.length());
			permutation(first+ch+last, up.substring(1));
		}
	}
	
	public static List<String> permutationList (String p, String up) {
		if(up.isEmpty()) {
			
			List<String> list=new ArrayList<String>();
			list.add(p);
			return list ;
		}
		
		List<String> al=new ArrayList<>();
		char ch=up.charAt(0);
		for (int i=0;i<=p.length();i++) {
			String first=p.substring(0,i);
			String last=p.substring(i,p.length());
			al.addAll(permutation(first+ch+last, up.substring(1)));
			
		}
		return al;
	}

}
