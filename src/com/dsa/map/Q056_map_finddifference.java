package com.dsa.map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q056_map_finddifference {

	public static void main(String[] args) {
		

	}
	public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		List<List<Integer>> ans=new ArrayList<List<Integer>>();
		List<Integer> ans1=new ArrayList<Integer>();
		List<Integer> ans2=new ArrayList<Integer>();
		Set<Integer> set1=new HashSet<Integer>();
		Set<Integer> set2=new HashSet<Integer>();
		
		for(int i: nums1) {
			set1.add(i);
		}
		for(int i: nums2) {
			set2.add(i);
		}
		
		for(int i: nums1) {
			if(!set2.contains(i)) {
				ans1.add(i);
			}
		}
		
		for(int i: nums2) {
			if(!set1.contains(i)) {
				ans2.add(i);
			}
		}
		
		ans.add(ans1);
		ans.add(ans2);
		
		return ans;
    }

}
