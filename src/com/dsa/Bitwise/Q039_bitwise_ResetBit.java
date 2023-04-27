package com.dsa.Bitwise;

public class Q039_bitwise_ResetBit {

	public static void main(String[] args) {
		//Reset = make the bit 0   and  a&0=0
		int a=7;
		System.out.println(ResetBit(a, 2));

	}
	public static int ResetBit(int n, int i) {
		return n&~(1<<(i-1));
		// 1 left shift and after complementing 
		//10000 complement = 01111
	}

}
