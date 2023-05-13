package com.dsa.Bitwise;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q057_Map_findDifference {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5 };
		int[] arr1 = { 2, 5 };
		System.out.println(findDifference(arr, arr1));

	}
	
	public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
		List<List<Integer>> listOfLists = new ArrayList<List<Integer>>();
		listOfLists.addAll(findDifference(nums1, nums2));
		listOfLists.addAll(findDifference(nums2, nums1));
		return listOfLists;
		    }
	
	
	
	
	

	public static List<Integer> findUniqueElem(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < nums1.length; i++) {

			if (map.containsKey(nums1[i])) {

				map.put(nums1[i], map.get(nums1[i]) + 1);

			} else {
				map.put(nums1[i], 1);
			}

		}

		for (int i = 0; i < nums2.length; i++) {

			if (map.containsKey(nums2[i])) {

				map.put(nums2[i], map.get(nums2[i]) + 1);

			}

		}

		List<Integer> keysWithValueGreaterThanOne = new ArrayList<Integer>();

		// Loop through the map and add the keys with a value greater than 1 to the list
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue()==1) {
				keysWithValueGreaterThanOne.add(entry.getKey());
			}
		}

		return keysWithValueGreaterThanOne;

	}

}
