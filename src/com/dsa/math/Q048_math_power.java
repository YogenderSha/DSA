package com.dsa.math;

public class Q048_math_power {

	public static void main(String[] args) {

	}

	public double myPow(double x, int n) {
		double ans = 1;
		while (n > 0) {
			if ((n & 1) == 1) {
				ans *= x;
			}
			x *= x;
			n = n >>> 1;
		}
		return ans;
	}

}
