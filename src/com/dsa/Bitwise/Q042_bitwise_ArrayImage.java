package com.dsa.Bitwise;

import java.util.Arrays;

public class Q042_bitwise_ArrayImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{1,1,0},{1,0,1},{0,0,0}};
		//System.out.println(Arrays.toString(flipAndInvertImage(arr)));
		flipAndInvertImage(arr);
		
		

	}
	 public static void flipAndInvertImage(int[][] image) {
	        for(int i=0;i<image.length;i++) {
	        	int last=image[i].length-1;
	        	for(int j=0;j<=last/2;j++) {
	        		int temp=image[i][j];
	        		image[i][j]=image[i][last-j]^1;
	        		image[i][last-j]=temp^1;
	        	}
	        }


	        for(int i=0;i<image.length;i++) {
	        	for(int j=0;j<image[i].length;j++) {
	        		System.out.print(image[i][j]+ " ");
	        	}
	        	System.out.println();
	        }
	        
	    }
	 
	

}
