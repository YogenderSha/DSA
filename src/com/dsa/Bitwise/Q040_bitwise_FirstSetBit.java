package com.dsa.Bitwise;

public class Q040_bitwise_FirstSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(FirstSetBit(8));

	}
	public static int FirstSetBit(int n) {
		int pos=0;
		while(n!=0) {
			if((n&1)==1) {
				return pos;
			}
			pos++;
			n=n>>1;
		}
		return -1;
	}

}
