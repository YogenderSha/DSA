package com.dsa.BinarySearch;

public class Q055_BinarySearch_mySqrt {

	public static void main(String[] args) {
		/*
		 * Given a non-negative integer x, return the square root of x rounded down to
		 * the nearest integer. The returned integer should be non-negative as well.
		 * 
		 * You must not use any built-in exponent function or operator.
		 * 
		 */
		System.out.println(mySqrt(2147395599));

	}
	
	public static long mySqrt(long x) {
		long start=0;
		long end=x;
		long ans=0;
		while(start<=end) {
			long mid=start+(end-start)/2;
			if(mid*mid==x) {
				return mid;
			}
			else if(mid*mid<x) {
				ans=mid;
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return ans;
	}

}
