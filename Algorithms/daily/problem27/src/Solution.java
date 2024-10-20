package Algorithms.daily.problem27.src;

import java.util.*;

class Solution {
    public static int removeElement(int[] nums, int val) {
        int i = 0, index = 0;

        while (i < nums.length) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
            i++;

        }
        return index;
    }

    public static void main(String[] args) {

        int[] arr = {0,1,2,2,3,0,4,2};
        int output = removeElement(arr, 2);

        System.out.println("output: " + output);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
