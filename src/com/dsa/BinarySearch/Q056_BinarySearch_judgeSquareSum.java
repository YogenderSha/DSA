package com.dsa.BinarySearch;

public class Q056_BinarySearch_judgeSquareSum {

	public static void main(String[] args) {
		System.out.println(judgeSquareSum(17));

	}

	public static boolean judgeSquareSum(int c) {
		
		for (int i=0;i<c;i++) {
			if(isPerfectSquare(i) && isPerfectSquare(c-i)) {
				return true;
			}
		}
		return false;

	}

	public static boolean isPerfectSquare(int x) {
		long start = 0;
		long end = x;
		long ans = 0;
		while (start <= end) {
			long mid = start + (end - start) / 2;
			if (mid * mid == x) {
				return true;
			} else if (mid * mid < x) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}

}
