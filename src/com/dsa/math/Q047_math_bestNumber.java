package com.dsa.math;

import java.util.ArrayList;
import java.util.List;


// https://practice.geeksforgeeks.org/problems/7a3e0427cbb1ea9fbfec499dc6fce377ffdf7aed/1

public class Q047_math_bestNumber {

	public static void main(String[] args) {
		
		int N = 1, A = 1, B = 1, C = 2, D = 3;
		System.out.println(bestNumbers(N, A, B, C, D));




	}
	
	//The method to return bestNumber count
	public static int bestNumbers(int N, int A, int B, int C, int D) {
		
		List<Integer> listb=new ArrayList<Integer>();
        for(int i=Lowerlimit(N);i<Upperlimit(N);i++) {
			
        	if(isGoodInt(i,A,B)) {
        		
        		if(isBestInt(i,C,D)) {
        			listb.add(i);
        			
        		}
        	}
		}
        return listb.size();
    }
	
	//check if num is a best Integer
	private static boolean isBestInt(int i,int C, int D) {
		int sum=sumDigits(i);
		while(sum>0) {
			int lastDigit=sum%10;
			if(lastDigit!=C || lastDigit!=D) {
				return false;
			}
			  sum=sum/10;
			}
			return true;
	}
	
	//Calculating sum of Digits for isBestInt() method
	private static int sumDigits(int num) {
		int sum=0;
		while(num>0) {
			int lastDigit=num%10;
			sum+=lastDigit;
			num=num/10;
		}
		return sum;
	}

	
	//check if num is a Good Integer
	private static boolean isGoodInt(int num,int A, int B) {
		while(num>0) {
		int lastDigit=num%10;
		if(lastDigit!=A || lastDigit!=B) {
			return false;
		}
		  num=num/10;
		}
		return true;
	}

	//finding the lower limit of n 
	public static int Lowerlimit(int n) {
		int LowerLimit=1;
		while(n>0) {
			LowerLimit*=10;
			n--;
		}
		return LowerLimit;
	}
	
	//finding the upperlimit of n
	public static int Upperlimit(int n) {
		int Upperlimit;
		Upperlimit=(Lowerlimit(n)*10)-1;
		return Upperlimit;
	}
	
	

}
