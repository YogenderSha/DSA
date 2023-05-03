package com.dsa.Bitwise;

public class Q054_bitwise_isPowerOfTwo {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo2(16));

	}

	public static boolean isPowerOfTwo(int n) {
		int a=n-1;
		while(a!=0) {
			if((a&1)!=1) {
				return false;
			}
			
			a=a>>1;
		}
		return true;
		

	}
	
	public static boolean isPowerOfTwo2(int n) {
		
		return (n&(n-1))==0;

	}

}
