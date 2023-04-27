package com.dsa.Bitwise;

public class Q038_bitwise_SetBit {

	public static void main(String[] args) {
		// Set bit = make it 1 and a||1==1;
		int na=7;
		System.out.println(SetBit(na, 4));

	}
	public static int SetBit(int num,int i) {
		return num|(1<<(i-1));
		//or the required bit with 1 
	}

}
