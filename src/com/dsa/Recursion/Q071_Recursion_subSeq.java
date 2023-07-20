package com.dsa.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Q071_Recursion_subSeq {

	public static void main(String[] args) {
		String y ="yogi";
		String p="";
		System.out.println(subSeq("", "yogi"));

	}
	
	public static void subSeq1(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch=up.charAt(0);
		subSeq(p, up.substring(1));
		subSeq(p+ch, up.substring(1));
	}
	
	public static List<String> subSeq(String p, String up) {
	    if (up.isEmpty()) {
	        List<String> list = new ArrayList<>();
	        list.add(p);
	        return list;
	    }

	    char ch = up.charAt(0);
	    List<String> result = new ArrayList<>();
	    result.addAll(subSeq(p, up.substring(1)));
	    result.addAll(subSeq(p + ch, up.substring(1)));
	    return result;
	}


}
