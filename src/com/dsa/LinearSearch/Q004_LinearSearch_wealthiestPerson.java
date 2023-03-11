package com.dsa.LinearSearch;

public class Q004_LinearSearch_wealthiestPerson {

	public static void main(String[] args) {
		int[][] accounts = { { 23, 45, 67 }, { 34, 56, 78 }, { 57, 56, 37 } };
		System.out.println("The wealthiest person has the money : "+ RichestWealth(accounts));

	}

	public static int RichestWealth(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;

			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			if (max < sum) {
				max=sum;
			}
		}
		return max;
	}

}
