package Algorithms.daily.problem2563.src.solution;

import java.util.Arrays;

public class Solution2 implements Solution {

    @Override
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            // Find the left bound where nums[i] + nums[left] >= lower
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[i] + nums[mid] >= lower) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            int start = left;

            // Reset right pointer to find upper bound
            left = i + 1;
            right = nums.length - 1;

            // Find the right bound where nums[i] + nums[right] <= upper
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[i] + nums[mid] <= upper) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            int end = right;

            // Add pairs count in range
            count += Math.max(0, end - start + 1);
        }

        return count;
    }
}
