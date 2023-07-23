package com.dsa.Recursion;

public class Q081_Recursion_countGoodNums {

	public static void main(String[] args) {
		//countGoodNumbersHelper(4, 0,"");
		System.out.println(countGoodNumbersCount(4, 0, ""));
	}
	
	private static final char[] evenNums = {
		    '0',      // 0
		    '2',      // 1
		    '4',   // 2
		    '6',   // 3
		    '8' // 4
		};
	
	private static final char[] primeNums = {
		    '2',      // 0
		    '3',      // 1
		    '5',   // 2
		    '7',   // 3
		};

	 public static void countGoodNumbersHelper(long n, int index, String p) {
	        if (n == 0) {
	            System.out.println(p);
	            return; // Added return statement to exit the function after printing.
	        }

	        // Check if the index is even or odd
	        char[] nums = (index % 2 == 0) ? evenNums : primeNums;

	        for (int i = 0; i < nums.length; i++) {
	            countGoodNumbersHelper(n - 1, index + 1, p + nums[i]);
	        }
	    }
	 
	 public static int countGoodNumbersCount(long n, int index, String p) {
	        if (n == 0) {
	            return 1;
	        }
            int count=0;
	        // Check if the index is even or odd
	        char[] nums = (index % 2 == 0) ? evenNums : primeNums;
 
	        for (int i = 0; i < nums.length; i++) {
	            count +=countGoodNumbersCount(n - 1, index + 1, p + nums[i]);
	        }
	        return count;
	    }

}
