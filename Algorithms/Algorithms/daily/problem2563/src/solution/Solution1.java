package Algorithms.Algorithms.daily.problem2563.src.solution;

import java.util.Arrays;

public class Solution1 implements Solution {

    @Override
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1 ; i < j && j < nums.length; j++) {
                long sum = nums[i] + nums[j];
                if (sum >= lower && sum <= upper) {
                    count++;
                }
            }
        }

        return count;
    }
}
