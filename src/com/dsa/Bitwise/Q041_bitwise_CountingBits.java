package com.dsa.Bitwise;

import java.util.Arrays;

public class Q041_bitwise_CountingBits {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(countBits(2)));

	}
	
   /*     public static int[] countBits(int n) {
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++) {
        	int count=0;
        
        	while(n!=0) {
        		if((n&1)==1) {
        			count++;
        		}
        		n=n>>1;
        		
        		
        	}
        	arr[i]=count;
        }
        return arr;
    }
    */
	 public static int[] countBits(int n) {
	        int []arr=new int[n+1];
	        
	        for(int i=0;i<=n;i++)
	        {
	            arr[i]=countsetbit(i);
	        }
	        return arr;
	    }
	    
	 
	 public static int countsetbit(int x)
	    {
	        int count=0;
	        while(x!=0)
	        {
	            count++;
	            x=x&(x-1);
	        }
	        return count;
	    }

}
