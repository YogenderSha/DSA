package com.dsa.dp;

public class Q084_DP_Leetcode {

	public static void main(String[] args) {
		int[] nums = {2,3,6,1,9,2};
        int x = 5;
        int maxScore = getMaxScore(nums, x);
        System.out.println("Maximum Total Score: " + maxScore);
	}
	
    public static int getMaxScore(int[] nums, int x) {
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = nums[0];

        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
        }

        int maxScore = dp[n - 1];
        int scoreWithMoving = nums[n - 1] - x;

        for (int i = n - 2; i >= 0; i--) {
            maxScore = Math.max(maxScore, dp[i] + scoreWithMoving);
            scoreWithMoving = Math.max(scoreWithMoving, nums[i] - x);
        }

        return maxScore;
    }

}
