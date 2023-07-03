package com.dsa.Recursion;

public class Q064_Recursion_CountZeroesinNumber {
    static int rem=0;
	public static void main(String[] args) {
		int a=2300000;
		System.out.println(CountZeroesinNum(a));

	}
	
	public static int CountZeroesinNum(int num) {
		return CountZeroesinNumber(num,0);
	}
	
	public static int CountZeroesinNumber(int num, int count) {
		rem=num%10;
		
		if(rem==0) {
			count++;
		}
		if(rem==num) {
			return count;
		}
		
		return CountZeroesinNumber(num/10,count);
		
	}

}
