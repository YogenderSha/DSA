package com.dsa.Bitwise;

public class Q035_bitwise_odd {

	public static void main(String[] args) {
		int a=3;
		System.out.println(isOdd(a));


	}
	public static boolean isOdd(int n) {
		return (n&1)==1;
	}

}
