package com.dsa.map;

import java.util.HashMap;
import java.util.Map;

public class Q072_Map_beautyOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/*
	public int maximumBeauty(int[] nums, int k) {
		int i=0;
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        while(i<nums.length) {
        	int num=nums[i];
        	while(nums[i]==num) {
        		map.put(num,map.getOrDefault(num,0)+1);
        		i++;
        	}
        	
        }
        for(int j=0;j<nums.length;j++) {
        	if(j>0 && map.get(nums[j-1])>map.get(nums[j+1]){
        		
        	}
        }
    }
    */
	public int maximumBeauty(int[] nums, int k) {
        Map<Integer, Integer> beauty = new HashMap<>();
        
        for (int num : nums) {
            beauty.put(num, beauty.getOrDefault(num, 0) + 1);
        }
        
        int maxBeauty = 0;
        
        for (int num : nums) {
            int curBeauty = beauty.get(num);
            
            if (beauty.containsKey(num - k)) {
                curBeauty += beauty.get(num - k);
            }
            
            if (beauty.containsKey(num + k)) {
                curBeauty += beauty.get(num + k);
            }
            
            maxBeauty = Math.max(maxBeauty, curBeauty - 1);
        }
        
        return maxBeauty;
    }

}
