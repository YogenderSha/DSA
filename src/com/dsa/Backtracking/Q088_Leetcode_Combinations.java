package com.dsa.Backtracking;

import java.util.ArrayList;
import java.util.List;

//Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].

public class Q088_Leetcode_Combinations {

	public static void main(String[] args) {

	}

	 public static List<List<Integer>> combine(int n, int k) {
         ArrayList<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        helper(n, k, 1, ds, ans); // start from 1 instead of 0
        return ans;
    }

    public static void helper(int n, int k, int start, ArrayList<Integer> list,List<List<Integer>> ans ) {
        if (list.size() == k) { // add a base case to terminate recursion when the list size reaches k
            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i <= n; i++) {
            list.add(i); // add the actual value i to the list instead of the index
            helper(n, k, i + 1, list, ans); // increment start to i + 1 to avoid duplicates
            list.remove(list.size() - 1); // remove the last element to backtrack

        }
    }

}
