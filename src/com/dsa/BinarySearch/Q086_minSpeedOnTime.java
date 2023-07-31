package com.dsa.BinarySearch;

public class Q086_minSpeedOnTime {

	public static void main(String[] args) {
		int[] dist = {1,3,2};
		double hour = 2.7;
		System.out.println(minSpeedOnTime(dist, hour));
		
		int[] dist1 = {1,3,2};
		double hour1 = 1.9;
		System.out.println(minSpeedOnTime(dist1, hour1));

	}

	public static int minSpeedOnTime(int[] dist, double hour) {
		 double totalDist = 0;
	        for (int nums : dist) {
	            totalDist += nums;
	        }

	        // Initialize lower and upper bounds for binary search
	        double low = 0;
	        double high = totalDist;

	        while (low < high) {
	            double mid = low + (high - low) / 2;
	            double totalTime = 0;
	            for (int i = 0; i < dist.length - 1; i++) {
	                totalTime += Math.ceil((double) dist[i] / mid);
	            }
	            totalTime += ((double) dist[dist.length - 1] / mid);

	            if (totalTime <= hour) {
	                high = mid;
	            } else {
	                low = mid + 1;
	            }
	        }

	        if (low >= totalDist) {
	            return -1;
	        }

	        return (int) Math.ceil(low);
    }

}
