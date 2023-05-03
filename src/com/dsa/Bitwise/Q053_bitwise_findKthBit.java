package com.dsa.Bitwise;

public class Q053_bitwise_findKthBit {

	public static void main(String[] args) {
		/*
		 * The problem number 1545 on LeetCode is "Find Kth Bit in Nth Binary String".
		 * Here's the problem statement:
		 * 
		 * Given two positive integers n and k, the binary string Sn is formed as
		 * follows:
		 * 
		 * S1 = "0" S2 = "01" S3 = "0110" S4 = "01101001" and so on. Return the kth bit
		 * in Sn. It is guaranteed that k is valid for the given n.
		 * 
		 */

	}

	public char findKthBit(int n, int k) {
		if (n == 1) {
			return '0';
		}
		int len = (int) Math.pow(2, n) - 1;
		int mid = (len + 1) / 2;
		if (k == mid) {
			return '1';
		} else if (k < mid) {
			return findKthBit(n - 1, k);
		} else {
			return (char) ('1' - findKthBit(n - 1, len - k + 1));
		}
	}
}
