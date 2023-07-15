package com.dsa.Recursion;

public class Q067_Recursion_subSeq {

	public static void main(String[] args) {
		String y ="yogi";
		String p="";
		subSeq("", "yogi");

	}
	
	public static void subSeq(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch=up.charAt(0);
		subSeq(p, up.substring(1));
		subSeq(p+ch, up.substring(1));
	}

}
