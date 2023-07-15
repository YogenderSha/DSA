package com.dsa.Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q069_Sorting_IntervalMerging {

	public static void main(String[] args) {
		int[][] arr= {{1,3},{2,5},{3,5},{7,9}};
		System.out.println(Arrays.toString(merge(arr)));

	}

	public static int[][] merge(int[][] intervals) {
		List<int[]> list=new ArrayList<int[]>();

		if(intervals.length==0||intervals==null) {
			return list.toArray(new int[0][]);
		}
		Arrays.sort(intervals,(a,b)->a[0]-b[0]);
		int start=intervals[0][0];
		int end=intervals[0][1];
		
		for(int[] i:intervals) {
			if(end>=i[0]) {
				end=Math.max(i[1], end);
			}
			else {
				list.add(new int[] {start,end});
				start=i[0];
				end=i[1];
			}
			list.add(new int[] {start,end});
		}
		return list.toArray(new int[0][]);

	}

}
