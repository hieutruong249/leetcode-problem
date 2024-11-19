package Algorithms.daily.problem2461.src.solution;

import java.util.*;

public class SolutionRaw implements Solution {

    @Override
    public long maximumSubarraySum(int[] nums, int k) {
        if (k > nums.length) {
            return 0;
        }

        List<int[]> listSubarray = splitDistinctSubarrays(nums, k);

        int maxSum = 0, currentSum = 0;

        for (int[] arr: listSubarray) {
            currentSum = sumArray(arr);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    public List<int[]> splitDistinctSubarrays(int[] nums, int k) {
        List<int[]> result = new ArrayList<>();

        // Generate subarrays of length k
        for (int i = 0; i <= nums.length - k; i++) {
            int[] subarray = new int[k];
            System.arraycopy(nums, i, subarray, 0, k);

            // Check if all elements in the subarray are distinct
            if (areElementsDistinct(subarray)) {
                result.add(subarray);
            }
        }

        return result;
    }

    private boolean areElementsDistinct(int[] array) {
        Set<Integer> seen = new HashSet<>();
        for (int num : array) {
            if (seen.contains(num)) {
                return false;
            }
            seen.add(num);
        }
        return true;
    }

    public int sumArray(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
}
