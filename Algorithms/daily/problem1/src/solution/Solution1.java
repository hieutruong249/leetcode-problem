package Algorithms.daily.problem1.src.solution;

public class Solution1 implements Solution {

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                if (target == nums[i] + nums[j] ) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
