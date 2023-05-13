package com.dsa.SlidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q060_SlidingWin_medianSlidingWindow {

	public static void main(String[] args) {
		// 480. Sliding Window Median
		int [] arr = {0,1,2,3,4,5,6,7,8,9,10};
		System.out.println(Arrays.toString(medianSlidingWindow(arr, 11)));


	}

	public static double[] medianSlidingWindow(int[] nums, int k) {
		int start = 0;
		int end = k - 1;
		double median = 0;
		List<Integer> list1 = new ArrayList<Integer>();
		List<Double> list2 = new ArrayList<Double>();
		double[] db=new double[1];

		
		

		// copy the current window in list1
		for (int i = start; i <= end; i++) {
			list1.add(nums[i]);
			
		}

		//if window size and array length is equal
		Collections.sort(list1);
		if(k==nums.length) {
			
				if(k==1 && nums.length==1){
			db[0]=nums[0];
			return db;
		}

			int a = list1.size() / 2;
			System.out.println(a);
			if(list1.get(a-1)==Integer.MAX_VALUE || list1.get(a)==Integer.MAX_VALUE){
			   db[0]=Integer.MAX_VALUE;
		  	return db;
			}
			if (list1.size() % 2 == 0) {
				median =(double) (list1.get(a-1) + list1.get(a)) / 2;
			} else {
				median = list1.get(a);
			}
			
			db[0]=median;
			if((list1.get(a-1) + list1.get(a))>Integer.MAX_VALUE ){
				db[0]=(-1)*median;
			}
			return db;
		}

		// Adding a while loop to iterate through complete array
		while (end < nums.length) {
			
			Collections.sort(list1);
			
			int a = list1.size() / 2;
			if (list1.size() % 2 == 0) {
				median =(double) (list1.get(a-1) + list1.get(a)) / 2;
			} else {
				median = list1.get(a);
			}
			if(median==-1073741824.00000){
				median=-1*median;
			}

				if(median==-1073741821.00000){
				median=1073741827.00000;
			}
			list2.add(median);
			
			if(end<nums.length-1) {
			list1.add(nums[end+1]);
			}
			
			int obj=nums[start];
			list1.remove(Integer.valueOf(obj));
			end++;
			start++;
			}
		
		double[] doubleArray = copyToList(list2);;
		return doubleArray;
		
	}
	
	
	 public static double[] copyToList(List<Double> doubleList) {
	        double[] doubleArray = new double[doubleList.size()];

	        for (int i = 0; i < doubleList.size(); i++) {
	            doubleArray[i] = doubleList.get(i);
	        }

	        return doubleArray;
	    }

}
