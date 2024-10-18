package Algorithms.daily.problem2044.src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    static List<Integer> or_list = new ArrayList<>();

    private static void helper(int[] nums, int sum, int idx) {
        if (idx == nums.length) {
            or_list.add(sum);
            return;
        }

        int val = sum | nums[idx];
        helper(nums, val, idx + 1);
        helper(nums, sum, idx + 1);
    }

    public static int countMaxOrSubsets(int[] nums) {
        helper(nums, 0, 0);

        or_list.sort(Collections.reverseOrder());
        int max = or_list.get(0);
        int res = 0;
        for (var l : or_list) {
            if (max == l)
                res++;
            else
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,5};
        int maxNum = countMaxOrSubsets(arr);
        System.out.println("countMaxOrSubsets: " + maxNum);
    }
}
