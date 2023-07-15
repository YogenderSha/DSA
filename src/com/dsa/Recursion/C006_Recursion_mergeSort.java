package com.dsa.Recursion;

import java.util.Arrays;

public class C006_Recursion_mergeSort {


	public static int[] mergeSort(int[] arr) {
		if(arr.length==1) {
			return arr;
		}
		int mid=arr.length/2;
		int[] left=mergeSort(Arrays.copyOfRange(arr,0, mid));
		int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length-1));
		
		return merge(left,right);
		
		
	}

	private static int[] merge(int[] left, int[] right) {
		int x=0,y=0,k=0;
		int[] mix=new int[left.length+right.length];
		while(x<left.length && y<right.length) {
			if(left[x]<right[y]) {
				mix[k]=left[x];
				k++;
				x++;
			}else {
				mix[k]=right[y];
				y++;
				k++;
			}
		}while(x<left.length) {
			mix[k]=left[x];
			k++;
			x++;
		}
		while(y<right.length) {
			mix[k]=right[y];
			k++;
			y++;
		}
		return mix;
	}

}
