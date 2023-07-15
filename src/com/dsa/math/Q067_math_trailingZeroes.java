package com.dsa.math;

public class Q067_math_trailingZeroes {
	
	
	public static int trailingZerosInFact(int num) {
		int sum=0,count=0;
		while(num>=5) {
			sum+=num/5;
			num=num/5;
		}
		return sum;
	}

}
