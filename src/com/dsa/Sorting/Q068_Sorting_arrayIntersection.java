package com.dsa.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q068_Sorting_arrayIntersection {

	public static void main(String[] args) {
		int[] nums= {2,2,3,4,5,6,6};
		int[] nums2= {2,3,3,4,4,5,5,6,6};
		System.out.println(Arrays.toString(intersection(nums, nums2)));

	}

	public static int[] intersection(int[] nums1, int[] nums2) {
         Set<Integer> set2=new HashSet<Integer>();
         Set<Integer> set=new HashSet<Integer>();
         
         for (int num : nums1) {
        	 set.add(num);
         }
         
         for (int num : nums2) {
        	 if(set.contains(num)) {
        		 set2.add(num);
        	 }
         }
         int[] array = new int[set2.size()];
         int index = 0;
         for (int num : set2) {
             array[index++] = num;
         }
         return array;
	}

}
