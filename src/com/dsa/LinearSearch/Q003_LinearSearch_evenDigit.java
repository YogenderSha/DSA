package com.dsa.LinearSearch;

public class Q003_LinearSearch_evenDigit {

	public static void main(String[] args) {
		// Finding even digit  numbers in the array
		int[] arr = { 6, 12, 34, 56, 67, 78, 90 };
		System.out.println("Number of even digit numbers in the given array is : "+ count(arr));


	}public static int count(int[] arr) {
		int eveCount=0;
		for(int i=0;i<=arr.length-1;i++) {
			if(evenDigit(arr[i])) {
				eveCount++;
			}
		}return eveCount;
	}
	
	public static boolean evenDigit(int num) {
		boolean even=false;
		int count=0;
		while(num>0) {
			num=num/10;
			count ++;
		}
		if(count%2==0) {
			even= true;
			return even;
		}else {
			return even;
		}
	}

}
