package com.dsa.Sorting;

public class Q034_Sorting_MedianAfterMerge {

	public static void main(String[] args) {
		int[] nums1 = {1,3};
		int[] nums2 = {2,4,5};
		System.out.println(MedianFind(nums1, nums2));

	}
	public static int MedianFind(int[] nums1,int[] nums2) {
		int m=0,n=0,k=0;
		int n1=nums1.length;
		int n2=nums2.length;
		int[] arr=new int[n1+n2];
		
		//MERGING THE ARRAY
		while(m<n1 && n<n2) {
			if(nums1[m]<=arr[n]) {
				arr[k++]=nums1[m++];
			}else {
				arr[k++]=nums1[n++];
			}
		}
		while(m<n1) {
			arr[k++]=arr[m++];
		}
		
		while(n<n2) {
			arr[k++]=arr[n++];
		}
		
		int mid=arr.length/2;
		//Finding the Median 
		if(arr.length%2==0) {
			return arr[mid]+arr[mid+1]/2;
		}
		else {
			return arr[mid];
		}
	}
	
	
	

}
