package com.dsa.Sorting;

public class Q046_Sorting_RotateArray {

	public static void main(String[] args) {
        int[] arr= {7,7,7,7,7,9,3};
        System.out.println(rotateArrayPivot(arr));
        int[] arra= { 3, 4, 3, 3, 3, 3, 3};
        System.out.println(rotateArrayPivot(arra));
        System.out.println(rotateArrayPivotDuplicate(arra));

	}
	
       public static int rotateArrayPivot(int[] nums) {
        if(nums==null) {
        	return 0;
        }
        
        int start=0,end=nums.length-1;
        while(start<=end) {
            int mid=start+(end-start)/2;
        	if(mid<end && nums[mid]>nums[mid+1]) {
        		return mid;
        	}
        	
        	else if(mid>0 && nums[mid]<nums[mid-1]) {
        		return mid-1;
        	}
        	
        	if(nums[mid]<nums[start]) {
        		end=mid-1;
        	}else {
        		start=mid+1;
        	}
        }
        return -1;
    }
       
       public static int rotateArrayPivotDuplicate(int[] nums) {
           if(nums==null) {
           	return 0;
           }
           int start=0,end=nums.length-1;
           while(start<=end) {
              int mid=start+(end-start)/2;
           	  if(mid<end && nums[mid]>nums[mid+1]) {
           		  return mid;
           	   }
           	
           	  else if(mid>0 && nums[mid]<nums[mid-1]) {
           		return mid-1;
               }
           	
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

}
