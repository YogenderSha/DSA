package com.dsa.LinearSearch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class codechef {

	public static void main(String[] args) {
		int[] arr= {1,2,4};
		System.out.println(isAPFree(arr));

	}
	
	
	public static boolean isAPFree(int[] arr) {
		int n=arr.length;
		for(int i=0;i<n;i++) {
			ArrayList<Integer> list = new ArrayList<Integer>(n);
			for(int j=i+1;j<n;j++) {
				if(arr[i]-arr[j]<0) {
					list.add(-1*(arr[i]-arr[j]));
				}else {
					list.add((arr[i]-arr[j]));
				}
			}
			
			if(containsNumberPairs(list)) {
				return false;
			}
		}
		return true;
		
	}
	/*
	 public static boolean containsDuplicates(ArrayList<Integer> list) {
	        HashSet<Integer> set = new HashSet<Integer>();
	        for (int i = 0; i < list.size(); i++) {
	            int element = list.get(i);
	            if (set.contains(element)) {
	                return true;
	            }
	            set.add(element);
	        }
	        return false;
	    }
*/
	public static boolean containsNumberPairs(List<Integer> list) {
        Set<Integer> set = new HashSet<Integer>();
        for (int number : list) {
            if (number!=0 && set.contains(number * 2) || (number % 2 == 0 && set.contains(number / 2))) {
                return true;
            }
            set.add(number);
        }
        return false;
    }
}
