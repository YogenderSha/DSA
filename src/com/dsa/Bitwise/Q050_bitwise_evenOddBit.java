package com.dsa.Bitwise;

import java.util.Arrays;

public class Q050_bitwise_evenOddBit {

	public static void main(String[] args) {
		/*
		 * You are given a positive integer n.
		 * 
		 * Let even denote the number of even indices in the binary representation of n
		 * (0-indexed) with value 1.
		 * 
		 * Let odd denote the number of odd indices in the binary representation of n
		 * (0-indexed) with value 1.
		 * 
		 * Return an integer array answer where answer = [even, odd].
		 * 
		 */
		System.out.println(Arrays.toString(evenOddBit(17)));
	}

	public static int[] evenOddBit(int n) {
		int pos=0;
		int count1=0,count2=0;
		while(n!=0) {
			if((n&1)==1 && pos%2==0) {
				count1++;
			} else if((n&1)==1 && pos%2==1) {
				count2++;
			}
			n=n>>1;
			pos++;
		}
		return new int[] {count1,count2};

	}

}
