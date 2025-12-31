package Graphs;

 

class Solution {

    public long maximumScore(int[] nums) {

        long max = Long.MIN_VALUE;

        for (int i = 0; i < nums.length - 1; i++) {
            long score = prefixSum(i, nums);
            max = Math.max(max, score);
        }

        return max;
    }

    public static long prefixSum(int j, int k[]) {

        int n = k.length;
        long pSum = 0;

        // prefix sum: 0 to j
        for (int i = 0; i <= j; i++) {
            pSum += k[i];
        }

        // suffix minimum: j+1 to end
        long min = k[j + 1];
        for (int i = j + 1; i < n; i++) {
            min = Math.min(min, k[i]);
        }

        return pSum - min;
    }
}
