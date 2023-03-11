package com.dsa.Sorting;

import java.util.*;
import java.util.Arrays;
import java.util.List;

public class Q023_Sorting_MajorityII {

	public static void main(String[] args) {
		// Majority elem is elem having the occurance more than n/3.
		int[] arr = { 3,2,3 };
		System.out.println(Majority(arr));
	}

	public static List<Integer> Majority(int[] nums) {
		int count1 = 0;
		int count2 = 0;
		int num1 = -1;
		int num2 = -1;

		for (int num : nums) {
				if (num == num1) {
					count1 += 1;
				} else if (num == num2) {
					count2 += 1;

				} else if (count1 == 0) {
					num1 = num;
					count1 = 1;
				} else if (count2 == 0) {
					num2 = num;
					count2 = 1;

				} else {
					count1--;
					count2--;
				}
		}
		List<Integer> list = new ArrayList<>();
		count1 = 0;
		count2 = 0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==num1) {
				count1++;
			}else if(nums[i]==num2) {
				count2++;
			}
		}
		if(count1>(nums.length)/3) {
			list.add(num1);
		}
		if(count2>nums.length/3){
			list.add(num2);
		}
		return list;

	}
}
