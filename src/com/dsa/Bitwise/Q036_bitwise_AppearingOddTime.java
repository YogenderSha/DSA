package com.dsa.Bitwise;

public class Q036_bitwise_AppearingOddTime {

	public static void main(String[] args) {
		// Assumption : Only one number is apperaing odd times
		int[] arr= {23,56,34,56,23};
		System.out.println(AppearingOddTimes(arr));

	}
	public static int AppearingOddTimes(int[] nums) {
		//a^a=0    a^0=a
		int unique=0;
		for(int elem : nums) {
			unique^=elem;
		}
		return unique;
	}

}
