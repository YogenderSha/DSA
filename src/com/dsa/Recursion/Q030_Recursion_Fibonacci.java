package com.dsa.Recursion;

public class Q030_Recursion_Fibonacci {

	public static void main(String[] args) {
		
		System.out.println(Fibo(3));


	}
	
	public static int Fibo(int x) {
		if(x<2) {
			return x;
		}
		return Fibo(x-1)+Fibo(x-2);
	}

}
