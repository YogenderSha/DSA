package com.dsa.Bitwise;

public class Q037_bitwise_ithBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int na=7;
		System.out.println(BitFinder(na, 5));

	}
	public static int BitFinder(int num,int n) {
		return (num &(1<< (n-1)))/(int)Math.pow(2, n-1);
	}

}
