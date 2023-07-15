package com.dsa.Sorting;

import java.util.ArrayList;
import java.util.List;

public class Q070_Sorting_SummaryRanges {

	public static void main(String[] args) {
		int[] arr= {0,1,2,4,5,7};
		System.out.println(summaryRanges(arr));

	}
	
	public static List<String> summaryRanges(int[] nums) {
		
		List<String> list=new ArrayList<String>();

        int start=nums[0];
        int end=nums[0];

        for(int num:nums){
            if(num==(1+end)||num==end){
                end=num;
            }else{
                if(start==end){
                    list.add(Integer.toString(end));
                }else{
                    list.add(start+"->"+end);
                }
                end=num;
                start=num;

            }

        }
        list.add(start+"->"+end);
        return list;
    }

}
