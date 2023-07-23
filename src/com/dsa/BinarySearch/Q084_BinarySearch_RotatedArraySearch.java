package com.dsa.BinarySearch;

public class Q084_BinarySearch_RotatedArraySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int rotateArrayPivotDuplicate(int[] nums) {
        int start=0,end=nums.length-1;
        while(start<=end) {
           int mid=start+(end-start)/2;
        	  if(mid<end && nums[mid]>nums[mid+1]) {
        		  return mid;
        	   }          	
        	  else if(mid>0 && nums[mid]<nums[mid-1]) {
        		return mid-1;}         	
        	 if(nums[mid]==nums[start] && nums[mid]==nums[end]) {          	 
        		 //Check whether start is pivot
        		 if(nums[start]>nums[start+1] || (nums[mid]==nums[start] && nums[end]< nums[mid])) {
        			 return start;
        		 }
        		 start++;          		 
        		 if(nums[end]<nums[end-1]) {
        			 return end-1;
        		 }
        		 end--;
        	 }
        	 //left side is sorted 
        	 else if(nums[start]<nums[mid] && (nums[start]==nums[mid] && nums[mid]>nums[end])) {
        		 start=mid+1;
        	 }else {
        		 end=mid-1;
        	 }
        }
        return -1;
    }


   public static int BinarySearch(int[] arr, int target,int start, int end) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			
			if (arr[mid] > target) {
				end = mid - 1;
			} else if (arr[mid] < target) {
				start = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
