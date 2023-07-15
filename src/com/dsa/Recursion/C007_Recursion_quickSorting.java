package com.dsa.Recursion;

import java.util.Arrays;

public class C007_Recursion_quickSorting {
	public static void main(String[] args) {
		int[] arr= {2,0,2,1,1,0};
		sort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));	}
	
	
	
	public static void quickSort(int[] arr, int start,int end) {
		if(start>=end) {
			return; 
		}
		
		int i=start,j=end;
		int m=arr.length/2;
		int pivot=arr[m];
		while(i>=j) {
			while(pivot>arr[i]) {
				i++;
			}
			while(pivot<arr[j]) {
				j--;
			}
			if(i>=j) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		quickSort(arr, start, i);
		quickSort(arr, j, end);
		
	}
	
	
	
	public static void quickSort2(int[] arr, int start, int end) {
	    if (start >= end) {
	        return;
	    }

	    int pivot = arr[start];
	    int i = start + 1;
	    int j = end;

	    while (i <= j) {
	        while (arr[i] < pivot) {
	            i++;
	        }

	        while (arr[j] > pivot) {
	            j--;
	        }

	        if (i <= j) {
	            int temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++;
	            j--;
	        }
	    }

	    quickSort(arr, start, j);
	    quickSort(arr, i, end);
	}
	
	static void sort(int[] nums, int low, int hi) {
        if (low >= hi) {
            return;
        }

        int s = low;
        int e = hi;
        int m = s + (e - s) / 2;
        int pivot = nums[m];

        while (s <= e) {

            // also a reason why if its already sorted it will not swap
            while (nums[s] < pivot) {
                s++;
            }
            while (nums[e] > pivot) {
                e--;
            }

            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // now my pivot is at correct index, please sort two halves now
        sort(nums, low, e);
        sort(nums, s, hi);
    }

}
