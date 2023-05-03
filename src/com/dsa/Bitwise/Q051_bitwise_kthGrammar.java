package com.dsa.Bitwise;
import java.math.*;
public class Q051_bitwise_kthGrammar {

	public static void main(String[] args) {
		
		System.out.println(kthGrammar(1, 1));

	}

	/*
	 * public static int kthGrammar(int n, int k) {
	 * 
	 * if(n==1 && k==1) { return 0; } int mid= (int) (Math.pow(2, n-1)/2);
	 * 
	 * if(n<=mid) { return kthGrammar(n-1, k); }else { return kthGrammar(n-1,
	 * k-mid)^1; }
	 * 
	 * }
	 */
	
	public static int kthGrammar(int n, int k) {
        if(n==1&&k==1)
            return 0;
        int mid=(int)Math.pow(2,n-1);
        mid/=2;
        if(k<=mid)
            return kthGrammar(n-1,k);
        else
            return kthGrammar(n-1,k-mid)^1;
    }

}
