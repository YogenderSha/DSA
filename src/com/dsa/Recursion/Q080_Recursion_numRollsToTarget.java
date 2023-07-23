package com.dsa.Recursion;

public class Q080_Recursion_numRollsToTarget {
	public static void main(String[] args) {

	}

	public static void numRollsToTargetPrint(String p,int target,int faces) {
             if(target==0) {
            	 System.out.println(p);
            	 return;
             } 
             
             for (int i=0;i<=faces && i<=target;i++) {
            	 numRollsToTarget(p+i, target-i, faces);
             }
	}
	
	public static int numRollsToTarget(String p,int target,int faces) {
        if(target==0) {
       	 return 1;
        } 
        int count=0;
        for (int i=0;i<=faces && i<=target;i++) {
       	 count = count + numRollsToTarget(p+i, target-i, faces);
        }
        return count;
	}
}
