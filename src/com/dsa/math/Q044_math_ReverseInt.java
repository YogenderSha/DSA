package com.dsa.math;

public class Q044_math_ReverseInt { 
	// Leetcode : 7. Reverse Integer

	public static void main(String[] args) {
		int x=123;
		System.out.println(ReverseInteger(x));

	}
	
	public static int ReverseInteger(int x) {
		long finalNum=0;
		while(x!=0) {
			int lastDig=x%10;
			finalNum += lastDig;
			finalNum *=10;
			x=x/10;
		}
		finalNum/=10;
		if(finalNum>Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE) {
			return 0;
		}
		
		if(x<0) {
			return (int) finalNum*-1;
		}
			
			return (int) finalNum;
		}
	}


