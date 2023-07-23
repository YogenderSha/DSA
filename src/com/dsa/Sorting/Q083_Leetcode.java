package com.dsa.Sorting;
import java.util.*;

public class Q083_Leetcode {

	public static void main(String[] args) {
		String s = "lEetcOde";
        String t = permuteString(s);
        System.out.println("Original String: " + s);
        System.out.println("Permutated String: " + t);
	}

	    public static String permuteString(String s) {
	        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };
	        List<Character> vowelList = new ArrayList<>();
	        List<Integer> vowelIndices = new ArrayList<>();
	        StringBuilder t = new StringBuilder(s);

	        // Step 1: Separate vowels and their indices
	        for (int i = 0; i < s.length(); i++) {
	            char ch = Character.toLowerCase(s.charAt(i));
	            if (Arrays.binarySearch(vowels, ch) >= 0) {
	                vowelList.add(s.charAt(i));
	                vowelIndices.add(i);
	            }
	        }

	        // Step 2: Sort vowels in non-decreasing order
	        Collections.sort(vowelList, new Comparator<Character>() {
	            @Override
	            public int compare(Character c1, Character c2) {
	                return c1.compareTo(c2);
	            }
	        });

	        // Step 3: Reconstruct the new string t
	        for (int i = 0; i < vowelList.size(); i++) {
	            char vowel = vowelList.get(i);
	            int index = vowelIndices.get(i);
	            t.setCharAt(index, vowel);
	        }

	        return t.toString();
	    } 
	}