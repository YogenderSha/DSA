package com.dsa.LinearSearch;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Q047_map_DuplicateFind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public boolean containsDuplicate(int[] nums) {
	        Map<Integer, Integer> map= new HashMap<Integer, Integer>();
	        int end=nums.length-1;
	        int count=0;
	        boolean findDuplicate=false;
	        for(int i = 0; i < nums.length; i++){
	            if(map.containsKey(nums[i])){
	                count = map.get(nums[i]);
	                map.put(nums[i], count + 1);
	            }
	            else{
	                map.put(nums[i], 1);
	            }
	        }

	        for(Entry<Integer,Integer> entry:map.entrySet()){
	            if(entry.getValue()>1){
	                findDuplicate=true;
	            }
	        }

	        return findDuplicate;


	    }

}
