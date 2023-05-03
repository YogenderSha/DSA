package com.dsa.Bitwise;

import java.util.Arrays;

public class Q049_bitwise_kthBit {

	public static void main(String[] args) {
		String y = "0";
		System.out.println(findKthBit(3, 1));

	}
	
	public static String findKthBit(int n, int k) {
		
	  }
    }

	/*
	 * public static String findKthBit(int n, int k) { if(n==1) { return "0"; }
	 * 
	 * return findKthBit(n-1,k)+"1"+reverse(invert(findKthBit(n-1,k)));
	 * 
	 * }
	 * 
	 * 
	 * private static String reverse(String str) { char[] ch=str.toCharArray(); int
	 * last=ch.length-1; for(int i=0;i<=last/2;i++) { char temp=ch[i];
	 * ch[i]=ch[last-i]; ch[last-i]=temp; } String string = new String(ch); return
	 * string; }
	 * 
	 * private static String invert(String str) { char[] ch=str.toCharArray(); int
	 * last=ch.length-1; for(int i=0;i<=last;i++) { if(ch[i]==0) { ch[i]=1; } else {
	 * ch[i]=0; } } return ch.toString(); }
	 */
}
